(function (console) { "use strict";
var $estr = function() { return js_Boot.__string_rec(this,''); };
function $extend(from, fields) {
	function Inherit() {} Inherit.prototype = from; var proto = new Inherit();
	for (var name in fields) proto[name] = fields[name];
	if( fields.toString !== Object.prototype.toString ) proto.toString = fields.toString;
	return proto;
}
var EReg = function(r,opt) {
	opt = opt.split("u").join("");
	this.r = new RegExp(r,opt);
};
EReg.__name__ = ["EReg"];
EReg.prototype = {
	match: function(s) {
		if(this.r.global) this.r.lastIndex = 0;
		this.r.m = this.r.exec(s);
		this.r.s = s;
		return this.r.m != null;
	}
	,matched: function(n) {
		if(this.r.m != null && n >= 0 && n < this.r.m.length) return this.r.m[n]; else throw new js__$Boot_HaxeError("EReg::matched");
	}
	,__class__: EReg
};
var HxOverrides = function() { };
HxOverrides.__name__ = ["HxOverrides"];
HxOverrides.cca = function(s,index) {
	var x = s.charCodeAt(index);
	if(x != x) return undefined;
	return x;
};
HxOverrides.substr = function(s,pos,len) {
	if(pos != null && pos != 0 && len != null && len < 0) return "";
	if(len == null) len = s.length;
	if(pos < 0) {
		pos = s.length + pos;
		if(pos < 0) pos = 0;
	} else if(len < 0) len = s.length + len - pos;
	return s.substr(pos,len);
};
Math.__name__ = ["Math"];
var Reflect = function() { };
Reflect.__name__ = ["Reflect"];
Reflect.field = function(o,field) {
	try {
		return o[field];
	} catch( e ) {
		if (e instanceof js__$Boot_HaxeError) e = e.val;
		return null;
	}
};
Reflect.fields = function(o) {
	var a = [];
	if(o != null) {
		var hasOwnProperty = Object.prototype.hasOwnProperty;
		for( var f in o ) {
		if(f != "__id__" && f != "hx__closures__" && hasOwnProperty.call(o,f)) a.push(f);
		}
	}
	return a;
};
var Std = function() { };
Std.__name__ = ["Std"];
Std.string = function(s) {
	return js_Boot.__string_rec(s,"");
};
Std["int"] = function(x) {
	return x | 0;
};
Std.parseInt = function(x) {
	var v = parseInt(x,10);
	if(v == 0 && (HxOverrides.cca(x,1) == 120 || HxOverrides.cca(x,1) == 88)) v = parseInt(x);
	if(isNaN(v)) return null;
	return v;
};
var StringTools = function() { };
StringTools.__name__ = ["StringTools"];
StringTools.isSpace = function(s,pos) {
	var c = HxOverrides.cca(s,pos);
	return c > 8 && c < 14 || c == 32;
};
StringTools.ltrim = function(s) {
	var l = s.length;
	var r = 0;
	while(r < l && StringTools.isSpace(s,r)) r++;
	if(r > 0) return HxOverrides.substr(s,r,l - r); else return s;
};
StringTools.rtrim = function(s) {
	var l = s.length;
	var r = 0;
	while(r < l && StringTools.isSpace(s,l - r - 1)) r++;
	if(r > 0) return HxOverrides.substr(s,0,l - r); else return s;
};
StringTools.trim = function(s) {
	return StringTools.ltrim(StringTools.rtrim(s));
};
var Type = function() { };
Type.__name__ = ["Type"];
Type.getClass = function(o) {
	if(o == null) return null; else return js_Boot.getClass(o);
};
Type.getClassName = function(c) {
	var a = c.__name__;
	if(a == null) return null;
	return a.join(".");
};
Type.enumIndex = function(e) {
	return e[1];
};
var haxe_StackItem = { __ename__ : true, __constructs__ : ["CFunction","Module","FilePos","Method","LocalFunction"] };
haxe_StackItem.CFunction = ["CFunction",0];
haxe_StackItem.CFunction.toString = $estr;
haxe_StackItem.CFunction.__enum__ = haxe_StackItem;
haxe_StackItem.Module = function(m) { var $x = ["Module",1,m]; $x.__enum__ = haxe_StackItem; $x.toString = $estr; return $x; };
haxe_StackItem.FilePos = function(s,file,line) { var $x = ["FilePos",2,s,file,line]; $x.__enum__ = haxe_StackItem; $x.toString = $estr; return $x; };
haxe_StackItem.Method = function(classname,method) { var $x = ["Method",3,classname,method]; $x.__enum__ = haxe_StackItem; $x.toString = $estr; return $x; };
haxe_StackItem.LocalFunction = function(v) { var $x = ["LocalFunction",4,v]; $x.__enum__ = haxe_StackItem; $x.toString = $estr; return $x; };
var haxe_CallStack = function() { };
haxe_CallStack.__name__ = ["haxe","CallStack"];
haxe_CallStack.getStack = function(e) {
	if(e == null) return [];
	var oldValue = Error.prepareStackTrace;
	Error.prepareStackTrace = function(error,callsites) {
		var stack = [];
		var _g = 0;
		while(_g < callsites.length) {
			var site = callsites[_g];
			++_g;
			if(haxe_CallStack.wrapCallSite != null) site = haxe_CallStack.wrapCallSite(site);
			var method = null;
			var fullName = site.getFunctionName();
			if(fullName != null) {
				var idx = fullName.lastIndexOf(".");
				if(idx >= 0) {
					var className = HxOverrides.substr(fullName,0,idx);
					var methodName = HxOverrides.substr(fullName,idx + 1,null);
					method = haxe_StackItem.Method(className,methodName);
				}
			}
			stack.push(haxe_StackItem.FilePos(method,site.getFileName(),site.getLineNumber()));
		}
		return stack;
	};
	var a = haxe_CallStack.makeStack(e.stack);
	Error.prepareStackTrace = oldValue;
	return a;
};
haxe_CallStack.callStack = function() {
	try {
		throw new Error();
	} catch( e ) {
		if (e instanceof js__$Boot_HaxeError) e = e.val;
		var a = haxe_CallStack.getStack(e);
		a.shift();
		return a;
	}
};
haxe_CallStack.makeStack = function(s) {
	if(s == null) return []; else if(typeof(s) == "string") {
		var stack = s.split("\n");
		if(stack[0] == "Error") stack.shift();
		var m = [];
		var rie10 = new EReg("^   at ([A-Za-z0-9_. ]+) \\(([^)]+):([0-9]+):([0-9]+)\\)$","");
		var _g = 0;
		while(_g < stack.length) {
			var line = stack[_g];
			++_g;
			if(rie10.match(line)) {
				var path = rie10.matched(1).split(".");
				var meth = path.pop();
				var file = rie10.matched(2);
				var line1 = Std.parseInt(rie10.matched(3));
				m.push(haxe_StackItem.FilePos(meth == "Anonymous function"?haxe_StackItem.LocalFunction():meth == "Global code"?null:haxe_StackItem.Method(path.join("."),meth),file,line1));
			} else m.push(haxe_StackItem.Module(StringTools.trim(line)));
		}
		return m;
	} else return s;
};
var haxe_Log = function() { };
haxe_Log.__name__ = ["haxe","Log"];
haxe_Log.trace = function(v,infos) {
	js_Boot.__trace(v,infos);
};
var haxe_Timer = function(time_ms) {
	var me = this;
	this.id = setInterval(function() {
		me.run();
	},time_ms);
};
haxe_Timer.__name__ = ["haxe","Timer"];
haxe_Timer.delay = function(f,time_ms) {
	var t = new haxe_Timer(time_ms);
	t.run = function() {
		t.stop();
		f();
	};
	return t;
};
haxe_Timer.prototype = {
	stop: function() {
		if(this.id == null) return;
		clearInterval(this.id);
		this.id = null;
	}
	,run: function() {
	}
	,__class__: haxe_Timer
};
var haxe_at_dotpoint_core_StringTool = function() { };
haxe_at_dotpoint_core_StringTool.__name__ = ["haxe","at","dotpoint","core","StringTool"];
haxe_at_dotpoint_core_StringTool.dumpObject = function(instance) {
	if(instance == null) return "null";
	var output = "";
	try {
		output = Type.getClassName(Type.getClass(instance)) + "\n{";
	} catch( error ) {
		if (error instanceof js__$Boot_HaxeError) error = error.val;
		output = "Dynamic\n{";
	}
	var _g = 0;
	var _g1 = Reflect.fields(instance);
	while(_g < _g1.length) {
		var n = _g1[_g];
		++_g;
		output += "\n\t." + n + " = " + Std.string(Reflect.field(instance,n));
	}
	output += "\n}";
	return output;
};
var haxe_at_dotpoint_logger_Log = function() { };
haxe_at_dotpoint_logger_Log.__name__ = ["haxe","at","dotpoint","logger","Log"];
haxe_at_dotpoint_logger_Log.initialize = function(loggerList,redirectTrace) {
	if(redirectTrace == null) redirectTrace = true;
	if(loggerList == null) {
		loggerList = [];
		loggerList.push(new haxe_at_dotpoint_logger_logger_TraceLogger());
	}
	haxe_at_dotpoint_logger_Log.loggerList = loggerList;
	haxe_at_dotpoint_logger_Log.nativeTrace = haxe_Log.trace;
	if(redirectTrace) haxe_Log.trace = haxe_at_dotpoint_logger_Log.onTrace;
};
haxe_at_dotpoint_logger_Log.onTrace = function(value,info) {
	if(js_Boot.__instanceof(value,haxe_at_dotpoint_logger_LogType) && info.customParams != null) switch(Type.enumIndex(value)) {
	case 2:
		haxe_at_dotpoint_logger_Log.error(info.customParams.shift(),info);
		break;
	case 1:
		haxe_at_dotpoint_logger_Log.warn(info.customParams.shift(),info);
		break;
	default:
		haxe_at_dotpoint_logger_Log.info(info.customParams.shift(),info);
	} else haxe_at_dotpoint_logger_Log.info(value,info);
};
haxe_at_dotpoint_logger_Log.getCallstack = function(length,seperator,startIndex) {
	if(startIndex == null) startIndex = 2;
	if(seperator == null) seperator = "\n";
	var stack = haxe_CallStack.callStack();
	var output = "";
	if(length == null) length = stack.length; else length = Std["int"](Math.min(startIndex + length,stack.length));
	var _g = startIndex;
	while(_g < length) {
		var j = _g++;
		var index = j;
		var item = stack[index].slice(2)[0];
		item = HxOverrides.substr(item,6,null);
		output += item;
		if(index + 1 < length) output += seperator;
	}
	return output;
};
haxe_at_dotpoint_logger_Log.info = function(value,info) {
	haxe_at_dotpoint_logger_Log.check();
	var _g = 0;
	var _g1 = haxe_at_dotpoint_logger_Log.loggerList;
	while(_g < _g1.length) {
		var logger = _g1[_g];
		++_g;
		haxe_at_dotpoint_logger_Log.delegateLog(logger,haxe_at_dotpoint_logger_LogType.INFO,value,info);
	}
	return value;
};
haxe_at_dotpoint_logger_Log.warn = function(value,info) {
	haxe_at_dotpoint_logger_Log.check();
	var _g = 0;
	var _g1 = haxe_at_dotpoint_logger_Log.loggerList;
	while(_g < _g1.length) {
		var logger = _g1[_g];
		++_g;
		haxe_at_dotpoint_logger_Log.delegateLog(logger,haxe_at_dotpoint_logger_LogType.WARNING,value,info);
	}
	return value;
};
haxe_at_dotpoint_logger_Log.error = function(value,info) {
	haxe_at_dotpoint_logger_Log.check();
	var _g = 0;
	var _g1 = haxe_at_dotpoint_logger_Log.loggerList;
	while(_g < _g1.length) {
		var logger = _g1[_g];
		++_g;
		haxe_at_dotpoint_logger_Log.delegateLog(logger,haxe_at_dotpoint_logger_LogType.ERROR,value,info);
	}
	return value;
};
haxe_at_dotpoint_logger_Log.delegateLog = function(logger,type,value,info) {
	if(logger.settings.ignoreLogType(type)) return;
	logger.log(type,value,info);
};
haxe_at_dotpoint_logger_Log.check = function() {
	if(haxe_at_dotpoint_logger_Log.loggerList == null) haxe_at_dotpoint_logger_Log.initialize();
	if(haxe_at_dotpoint_logger_Log.loggerList.length == 0) throw new js__$Boot_HaxeError("must add a ILogger to Log.loggerList");
};
var haxe_at_dotpoint_logger_LogType = { __ename__ : true, __constructs__ : ["INFO","WARNING","ERROR"] };
haxe_at_dotpoint_logger_LogType.INFO = ["INFO",0];
haxe_at_dotpoint_logger_LogType.INFO.toString = $estr;
haxe_at_dotpoint_logger_LogType.INFO.__enum__ = haxe_at_dotpoint_logger_LogType;
haxe_at_dotpoint_logger_LogType.WARNING = ["WARNING",1];
haxe_at_dotpoint_logger_LogType.WARNING.toString = $estr;
haxe_at_dotpoint_logger_LogType.WARNING.__enum__ = haxe_at_dotpoint_logger_LogType;
haxe_at_dotpoint_logger_LogType.ERROR = ["ERROR",2];
haxe_at_dotpoint_logger_LogType.ERROR.toString = $estr;
haxe_at_dotpoint_logger_LogType.ERROR.__enum__ = haxe_at_dotpoint_logger_LogType;
var haxe_at_dotpoint_logger_LoggerSettings = function() {
	this.enableInfo = true;
	this.enableWarning = true;
	this.enableError = true;
};
haxe_at_dotpoint_logger_LoggerSettings.__name__ = ["haxe","at","dotpoint","logger","LoggerSettings"];
haxe_at_dotpoint_logger_LoggerSettings.prototype = {
	ignoreLogType: function(type) {
		if(this.enableInfo && type == haxe_at_dotpoint_logger_LogType.INFO || this.enableWarning && type == haxe_at_dotpoint_logger_LogType.WARNING || this.enableError && type == haxe_at_dotpoint_logger_LogType.ERROR) return false; else return true;
	}
	,__class__: haxe_at_dotpoint_logger_LoggerSettings
};
var haxe_at_dotpoint_logger_logger_BaseLogger = function(settings) {
	if(settings != null) this.settings = settings; else this.settings = new haxe_at_dotpoint_logger_LoggerSettings();
};
haxe_at_dotpoint_logger_logger_BaseLogger.__name__ = ["haxe","at","dotpoint","logger","logger","BaseLogger"];
haxe_at_dotpoint_logger_logger_BaseLogger.prototype = {
	__class__: haxe_at_dotpoint_logger_logger_BaseLogger
};
var haxe_at_dotpoint_logger_logger_ILogger = function() { };
haxe_at_dotpoint_logger_logger_ILogger.__name__ = ["haxe","at","dotpoint","logger","logger","ILogger"];
haxe_at_dotpoint_logger_logger_ILogger.prototype = {
	__class__: haxe_at_dotpoint_logger_logger_ILogger
};
var haxe_at_dotpoint_logger_logger_TraceLogger = function(settings) {
	haxe_at_dotpoint_logger_logger_BaseLogger.call(this,settings);
	this.step = 0;
};
haxe_at_dotpoint_logger_logger_TraceLogger.__name__ = ["haxe","at","dotpoint","logger","logger","TraceLogger"];
haxe_at_dotpoint_logger_logger_TraceLogger.__interfaces__ = [haxe_at_dotpoint_logger_logger_ILogger];
haxe_at_dotpoint_logger_logger_TraceLogger.__super__ = haxe_at_dotpoint_logger_logger_BaseLogger;
haxe_at_dotpoint_logger_logger_TraceLogger.prototype = $extend(haxe_at_dotpoint_logger_logger_BaseLogger.prototype,{
	log: function(type,msg,info) {
		if(this.step < 0) this.step = 0;
		var prefix = this.getPrefix();
		if(typeof(msg) == "string") {
			var code = Std.string(msg).substring(0,2);
			if(code == ">>") this.step++;
			if(code == "<<") {
				this.step--;
				prefix = this.getPrefix();
			}
		}
		if(type == haxe_at_dotpoint_logger_LogType.INFO) haxe_at_dotpoint_logger_Log.nativeTrace(prefix + Std.string(msg),info); else haxe_at_dotpoint_logger_Log.nativeTrace(prefix + Std.string(type) + " :: " + Std.string(msg),info);
	}
	,getPrefix: function() {
		var prefix = "";
		var _g1 = 0;
		var _g = this.step;
		while(_g1 < _g) {
			var j = _g1++;
			prefix += "\t";
		}
		return prefix;
	}
	,__class__: haxe_at_dotpoint_logger_logger_TraceLogger
});
var js__$Boot_HaxeError = function(val) {
	Error.call(this);
	this.val = val;
	this.message = String(val);
	if(Error.captureStackTrace) Error.captureStackTrace(this,js__$Boot_HaxeError);
};
js__$Boot_HaxeError.__name__ = ["js","_Boot","HaxeError"];
js__$Boot_HaxeError.__super__ = Error;
js__$Boot_HaxeError.prototype = $extend(Error.prototype,{
	__class__: js__$Boot_HaxeError
});
var js_Boot = function() { };
js_Boot.__name__ = ["js","Boot"];
js_Boot.__unhtml = function(s) {
	return s.split("&").join("&amp;").split("<").join("&lt;").split(">").join("&gt;");
};
js_Boot.__trace = function(v,i) {
	var msg;
	if(i != null) msg = i.fileName + ":" + i.lineNumber + ": "; else msg = "";
	msg += js_Boot.__string_rec(v,"");
	if(i != null && i.customParams != null) {
		var _g = 0;
		var _g1 = i.customParams;
		while(_g < _g1.length) {
			var v1 = _g1[_g];
			++_g;
			msg += "," + js_Boot.__string_rec(v1,"");
		}
	}
	var d;
	if(typeof(document) != "undefined" && (d = document.getElementById("haxe:trace")) != null) d.innerHTML += js_Boot.__unhtml(msg) + "<br/>"; else if(typeof console != "undefined" && console.log != null) console.log(msg);
};
js_Boot.getClass = function(o) {
	if((o instanceof Array) && o.__enum__ == null) return Array; else {
		var cl = o.__class__;
		if(cl != null) return cl;
		var name = js_Boot.__nativeClassName(o);
		if(name != null) return js_Boot.__resolveNativeClass(name);
		return null;
	}
};
js_Boot.__string_rec = function(o,s) {
	if(o == null) return "null";
	if(s.length >= 5) return "<...>";
	var t = typeof(o);
	if(t == "function" && (o.__name__ || o.__ename__)) t = "object";
	switch(t) {
	case "object":
		if(o instanceof Array) {
			if(o.__enum__) {
				if(o.length == 2) return o[0];
				var str2 = o[0] + "(";
				s += "\t";
				var _g1 = 2;
				var _g = o.length;
				while(_g1 < _g) {
					var i1 = _g1++;
					if(i1 != 2) str2 += "," + js_Boot.__string_rec(o[i1],s); else str2 += js_Boot.__string_rec(o[i1],s);
				}
				return str2 + ")";
			}
			var l = o.length;
			var i;
			var str1 = "[";
			s += "\t";
			var _g2 = 0;
			while(_g2 < l) {
				var i2 = _g2++;
				str1 += (i2 > 0?",":"") + js_Boot.__string_rec(o[i2],s);
			}
			str1 += "]";
			return str1;
		}
		var tostr;
		try {
			tostr = o.toString;
		} catch( e ) {
			if (e instanceof js__$Boot_HaxeError) e = e.val;
			return "???";
		}
		if(tostr != null && tostr != Object.toString && typeof(tostr) == "function") {
			var s2 = o.toString();
			if(s2 != "[object Object]") return s2;
		}
		var k = null;
		var str = "{\n";
		s += "\t";
		var hasp = o.hasOwnProperty != null;
		for( var k in o ) {
		if(hasp && !o.hasOwnProperty(k)) {
			continue;
		}
		if(k == "prototype" || k == "__class__" || k == "__super__" || k == "__interfaces__" || k == "__properties__") {
			continue;
		}
		if(str.length != 2) str += ", \n";
		str += s + k + " : " + js_Boot.__string_rec(o[k],s);
		}
		s = s.substring(1);
		str += "\n" + s + "}";
		return str;
	case "function":
		return "<function>";
	case "string":
		return o;
	default:
		return String(o);
	}
};
js_Boot.__interfLoop = function(cc,cl) {
	if(cc == null) return false;
	if(cc == cl) return true;
	var intf = cc.__interfaces__;
	if(intf != null) {
		var _g1 = 0;
		var _g = intf.length;
		while(_g1 < _g) {
			var i = _g1++;
			var i1 = intf[i];
			if(i1 == cl || js_Boot.__interfLoop(i1,cl)) return true;
		}
	}
	return js_Boot.__interfLoop(cc.__super__,cl);
};
js_Boot.__instanceof = function(o,cl) {
	if(cl == null) return false;
	switch(cl) {
	case Int:
		return (o|0) === o;
	case Float:
		return typeof(o) == "number";
	case Bool:
		return typeof(o) == "boolean";
	case String:
		return typeof(o) == "string";
	case Array:
		return (o instanceof Array) && o.__enum__ == null;
	case Dynamic:
		return true;
	default:
		if(o != null) {
			if(typeof(cl) == "function") {
				if(o instanceof cl) return true;
				if(js_Boot.__interfLoop(js_Boot.getClass(o),cl)) return true;
			} else if(typeof(cl) == "object" && js_Boot.__isNativeObj(cl)) {
				if(o instanceof cl) return true;
			}
		} else return false;
		if(cl == Class && o.__name__ != null) return true;
		if(cl == Enum && o.__ename__ != null) return true;
		return o.__enum__ == cl;
	}
};
js_Boot.__nativeClassName = function(o) {
	var name = js_Boot.__toStr.call(o).slice(8,-1);
	if(name == "Object" || name == "Function" || name == "Math" || name == "JSON") return null;
	return name;
};
js_Boot.__isNativeObj = function(o) {
	return js_Boot.__nativeClassName(o) != null;
};
js_Boot.__resolveNativeClass = function(name) {
	return (Function("return typeof " + name + " != \"undefined\" ? " + name + " : null"))();
};
var js_thnx_MainJS = function() {
	this.gameURL = "http://apps.playcanvas.com.s3-website-eu-west-1.amazonaws.com/R4GZNWYr/";
};
js_thnx_MainJS.__name__ = ["js","thnx","MainJS"];
js_thnx_MainJS.main = function() {
	js_thnx_MainJS.instance = new js_thnx_MainJS();
	js_thnx_MainJS.instance.initialize();
};
js_thnx_MainJS.prototype = {
	initialize: function() {
		haxe_at_dotpoint_logger_Log.initialize();
		this.connectAI();
	}
	,openFrame: function() {
		window.addEventListener("message",$bind(this,this.onGameMessage),false);
		this.frame = window.document.getElementById("game");
		this.frame.onload = $bind(this,this.onFrameComplete);
		this.frame.src = this.gameURL;
	}
	,onFrameComplete: function(event) {
		this.isInitialized = true;
	}
	,connectAI: function() {
		this.serverAI = new WebSocket("ws://localhost:9998");
		this.serverAI.onerror = $bind(this,this.onServerError);
		this.serverAI.onopen = $bind(this,this.onServerOpen);
		this.serverAI.onmessage = $bind(this,this.onServerMessage);
		this.serverAI.onclose = $bind(this,this.onServerClose);
		if(this.serverAI.readyState == 2 || this.serverAI.readyState == 3) this.reconnectAI();
	}
	,reconnectAI: function() {
		this.serverAI.close();
		this.serverAI = null;
		haxe_Timer.delay($bind(this,this.connectAI),2000);
	}
	,onServerError: function(event) {
		haxe_Log.trace("AI-Connection:error",{ fileName : "MainJS.hx", lineNumber : 130, className : "js.thnx.MainJS", methodName : "onServerError"});
		this.reconnectAI();
	}
	,onServerOpen: function(event) {
		haxe_Log.trace("AI-Connection:successful",{ fileName : "MainJS.hx", lineNumber : 140, className : "js.thnx.MainJS", methodName : "onServerOpen"});
		if(!this.isInitialized) this.openFrame(); else window.location.reload();
	}
	,onServerClose: function(event) {
		haxe_Log.trace("AI-Connection:close",{ fileName : "MainJS.hx", lineNumber : 152, className : "js.thnx.MainJS", methodName : "onServerClose"});
		if(this.serverAI != null && (this.serverAI.readyState == 2 || this.serverAI.readyState == 3)) this.reconnectAI();
	}
	,onServerMessage: function(event) {
		if(event != null) this.frame.contentWindow.postMessage(event.data,"*");
	}
	,onGameMessage: function(message) {
		if(message != null) this.serverAI.send(message.data);
	}
	,__class__: js_thnx_MainJS
};
var $_, $fid = 0;
function $bind(o,m) { if( m == null ) return null; if( m.__id__ == null ) m.__id__ = $fid++; var f; if( o.hx__closures__ == null ) o.hx__closures__ = {}; else f = o.hx__closures__[m.__id__]; if( f == null ) { f = function(){ return f.method.apply(f.scope, arguments); }; f.scope = o; f.method = m; o.hx__closures__[m.__id__] = f; } return f; }
String.prototype.__class__ = String;
String.__name__ = ["String"];
Array.__name__ = ["Array"];
var Int = { __name__ : ["Int"]};
var Dynamic = { __name__ : ["Dynamic"]};
var Float = Number;
Float.__name__ = ["Float"];
var Bool = Boolean;
Bool.__ename__ = ["Bool"];
var Class = { __name__ : ["Class"]};
var Enum = { };
js_Boot.__toStr = {}.toString;
js_thnx_MainJS.main();
})(typeof console != "undefined" ? console : {log:function(){}});

//# sourceMappingURL=jsout.js.map