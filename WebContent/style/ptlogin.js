





function S(bp)
{
return document.getElementById(bp)||null;
}
function extend()
{
for(var bU=arguments,uD=bU[0],i=1,be=bU.length;i<be;i++)
{
var He=bU[i];
for(var j in He)
{
uD[j]=He[j];
}
}
return uD;
}
function stopProp(evt)
{
if(evt)
{
evt.stopPropagation?evt.stopPropagation():(evt.cancelBubble=true);
}
};
function preventDefault(evt)
{
if(evt)
{
evt.preventDefault?evt.preventDefault():(evt.returnValue=false);
}
}
function addClass(aoDom,asClass)
{
var sClass=" "+aoDom.className+" ";
if(sClass.indexOf(" "+asClass+" ")<0)
{
aoDom.className+=aoDom.className?" "+asClass:asClass;
}
};
function trim(str)
{
return str.replace(/(^\s+|\s+$)/g,"");
};
function rmClass(aoDom,asClass)
{
if(asClass)
{
var sClass=" "+aoDom.className+" ";
sClass=sClass.replace(" "+asClass+" "," ");
aoDom.className=trim(sClass);
}
else
{
aoDom.className="";
}
};
function addEvent(as,aC,Ah,Fy)
{
if(as&&Ah)
{
if(as.addEventListener)
{
as[Fy?"removeEventListener":"addEventListener"](
aC,Ah,false
);
}
else if(as.attachEvent)
{
as[Fy?"detachEvent":"attachEvent"]("on"+aC,
Ah
);
}
else
{
as["on"+aC]=Fy?null:Ah;
}
}
return as;
};
function addEvents(sp,wy,Fy)
{
for(var aC in wy)
{
addEvent(sp,aC,wy[aC],Fy);
}
return sp;
}
function getStyle(dq,cfC)
{
var uS=dq&&(dq.currentStyle
?dq.currentStyle
:dq.ownerDocument.defaultView.getComputedStyle(dq,null));
return uS&&uS[cfC]||"";
}
function show(wc,uZ,hI)
{
var gh=(typeof(wc)=="string"?S(wc,hI):wc);
if(gh)
{
gh.style.display=(uZ?"":"none");
}
return gh;
};
function setFocus(bp)
{
var ay=S(bp);
if(ay)
{
try
{
ay.focus();
ay.onfocus();
}catch(e){};
}
};
function isShow(wc,hI)
{
return(getStyle((typeof(wc)=="string"?S(wc,hI):wc),"display")||"none")
!="none";
};
function loadJsFile(pY,aid)
{
var bw=document,
bzt=typeof aid=="function",
dqb,jB;

jB=bw.createElement("script");
(bw.getElementsByTagName("head")[0]||bw.documentElement)
.appendChild(extend(jB,
bzt&&
{
onload:aid,
onreadystatechange:function()
{
var ad=this;
({loaded:true,complete:true}[ad.readyState])
&&(!ad.cmM)&&(ad.cmM=true)
&&aid.call(ad);
}
},
{
type:"text/javascript",
charset:"gb2312",
src:pY
}
)
);
return jB;
};
function htmlEncode(cw)
{
return cw&&cw.replace?(cw.replace(/&/g,"&amp;").replace(/\"/g,"&quot;")
.replace(/</g,"&lt;").replace(/>/g,"&gt;").replace(/\'/g,"&#39;")):cw;
}
function subAsiiStrLogin(cw,sw,aca)
{
var KE=function(hj){return hj},


Kh=KE,
ik=KE(trim((cw||"").toString())),
GJ=aca||"",
Rq=Math.max(sw-GJ.length,1),
abJ=ik.length,
Am=0,
yv=-1,
tx;

for(var i=0;i<abJ;i++)
{
tx=ik.charCodeAt(i);


Am+=tx==35||tx==87
?1.3
:(tx>255?1.5:1);

if(yv==-1&&Am>Rq)
{
yv=i;
}

if(Am>sw)
{
return Kh(ik.substr(0,Am-1))+GJ;
}
}

return Kh(ik);
}






function AutoComplete(bq,FT,jZ)
{
var ad=this;



function eG()
{
ad.bpD=ejI(bq);
ad.GO=bq;
ad.Fg=FT;

zh(bq);
};
function dWi(eyi)
{

var bRj=0;
var ci=ad.Fg;
for(var i=ci.length;i>0;i--)
{
if(ci[i-1].indexOf(eyi)==0)
{
bRj=i-1
}
}
return bRj;
}
function Nl(ij)
{

var bL=ad.GO.value,
xD=bL.replace(/@.*$/g,""),
cvO=bL.replace(/^.*@/g,"@"),
auW=ij||event,
cAZ=auW.keyCode==38||auW.keyCode==40||auW.keyCode==13;

if(auW.type!="keydown")
{

if(xD||bL&&(!ad.dNS||ad.dNS!=bL))
{
var fA=[],
ci=ad.Fg,
bRj=dWi(cvO);
for(var i=0;i<ci.length;i++)
{
fA.push([
'<div class="auto_item ',
bRj==i?'auto_select':'',
'" alias="',xD,'" domain="',FT[i],'" title="使用 ',xD,FT[i],' 登录" >',
'<span>',htmlEncode(subAsiiStrLogin(xD,14,"...")),'</span><span style="color:#999">',FT[i],'</span>',
'</div>'
].join(""));
}
if(!cAZ)
{
ad.bpD.innerHTML=fA.join("");
}

setTimeout(function()
{
var ci=ad.bpD.childNodes;











if(!cAZ)
{
aAn(ci[bRj]);
}

for(var i=0,l=ci.length;i<l;i++)
{
(function(as){
addEvent(as,"mousedown",alT);
addEvent(as,"mouseover",aAn);
})(ci[i]);
}
}
);
ad.show();
}
else if(!bL&&!cAZ)
{
ad.hide();
}
else if(xD)
{
ad.show();
}
else
{
ad.hide();
}
}



if(auW.type=="keydown")
{


if(auW.keyCode==38)
{
var uc=ad.bpD.childNodes,
AT=(ad.dlF||uc[0]).previousSibling;
aAn(AT||uc[uc.length-1]);
preventDefault(auW);
}

else if(auW.keyCode==40)
{
var uc=ad.bpD.childNodes,
wG=(ad.dlF||uc[0]).nextSibling;
aAn(wG||uc[0]);
preventDefault(auW);
}

else if(auW.keyCode==13)
{
if(bL)
alT();
preventDefault(auW);
}

else if(auW.keyCode==9)
{


}
}


ad.dNS=bL;
};
function aAn(cvg)
{
var ci=ad.bpD.childNodes,
ay=cvg.tagName&&cvg||cvg.target||cvg.srcElement;

ay.parentNode.getAttribute("domain")&&(ay=ay.parentNode);


for(var i=0,l=ci.length;i<l;i++)
{
if(ay==ci[i])
{
addClass(ci[i],"auto_select");
ad.dlF=ci[i];
}
else
{
rmClass(ci[i],"auto_select");
}
}
};
function alT()
{
var cWm=ad.dlF,
bL=ad.GO.value,
cvO="|"+bL.replace(/^.*@/g,"@"),
dXP=["|",ad.Fg.join("|"),"|"].join("");

if(cWm)
{


if(bL&&(dXP.indexOf(cvO)>-1||cvO.indexOf("@")<0))
{
ad.GO.value=cWm.getAttribute("alias")+cWm.getAttribute("domain");
}

ad.hide();

jZ&&setTimeout(function(){
jZ();
});
}
};
function ejI(bFm)
{
var auS=document.createElement("div");
auS.className="autocomplete";
auS.id="auto_container";

show(auS,false);
bFm.parentNode.appendChild(auS);
return auS;
};
function zh(bFm)
{
addEvent(bFm,"keyup",Nl);
addEvent(bFm,"keydown",Nl);
addEvent(bFm,"blur",function(){alT();dDJ("addr");ad.hide();});
addEvent(bFm,"change",function(){});
};

this.show=function()
{
show(ad.bpD,true);
};
this.hide=function()
{
show(ad.bpD,false);
};

eG();
};
function LabelDisplay(dje)
{
var fP=typeof dje=="string"?[dje]:dje;
function eG()
{
if(fP.length)
{
for(var i=0;i<fP.length;i++)
{
dRe(fP[i]);
}
}
}


function dRe(bp)
{
var aHe="label_",
gB=S(aHe+bp),
bR=S(bp);
if(!gB)return;

addEvent(bR,"keyup",Nl);
addEvent(bR,"keydown",Nl);
addEvent(bR,"input",Nl);
addEvent(bR,"click",Nl);


bR.onfocus=function(){if(bp=="p"){cwq();}Nl(this);BP(true)};
bR.onblur=function(){Nl(this);BP()};

function BP(aPi)
{
gB.style.color=aPi?"#ccc":"";

};
function Nl()
{
gB.innerHTML=bR.value?"&nbsp;":gB.getAttribute("default_txt");
gB.style.color=bR.value?"":"#ccc";
};
function dbj(o,l)
{
if(o.value)
{
l.innerHTML="&nbsp;";
}
else
{
l.innerHTML=l.getAttribute("default_txt");
}
};
dbj(bR,gB);


setTimeout(function(o,l){
return function(){
dbj(o,l);
}
}(bR,gB),100);
setInterval(function(o,l){
return function(){
dbj(o,l);
}
}(bR,gB),800);
};

eG();
}
function detectCapsLock(mr,czj,hz)
{
if(!mr)
{
return;
}
function showTips(ag)
{
show(S("capTip"),true);
}
function hideTips()
{
show(S("capTip"),false);
}
var aap=-1;
addEvents(mr,{
keydown:function(ag)
{
var qN=ag.keyCode||ag.charCode

if(qN==20)
{
if(aap==0)
{
showTips(ag);
aap=1;
}
else if(aap==1)
{
hideTips();
aap=0;
}

}
},
keypress:function(ag)
{
var qN=ag.keyCode||ag.charCode,
LJ=ag.shiftKey;

if((qN>=65&&qN<=90&&!LJ)
||(qN>=97&&qN<=122&&LJ))
{
aap=1
showTips(ag);
}
else if((qN>=97&&qN<=122&&!LJ)||(qN>=65&&qN<=90&&LJ))
{
aap=0;
hideTips();
}
else
{
hideTips();
}
},
blur:function()
{
hideTips();
}
});
};






var uI={};
function esW()
{
if(uI.beo==QMCFG.logintype)
{
imgLoadReport();
}
kg(1);
}
function cwq()
{


if(uI.beo==QMCFG.logintype)
{
il();
window.check&&check();
}
}
function aGo()
{
WO();
setTimeout(function(){
setFocus("uin");
cwq();
});
}
function bCx()
{
if(uI.beo==QMCFG.logintype)
{
ptui_changeImg();
}
else
{
S('vfcode').src=QMCFG.servername+"/cgi-bin/getverifyimage?aid=23000101&f=html&ck=1&r="+Math.random();
setFocus("verifycode");
}
}




function dDJ(aC)
{
kg(2);
if(uI.beo==QMCFG.logintype)
{
var eyM=["|",uI.eyU.join("|"),"|"].join("");
il();


if(uI.yf&&eyM.indexOf(["|",uI.dIS,"|"].join(""))<0)
{
WO("请输入正确的QQ邮箱帐号");

kg(3);
return false;
}
else if(aC=="addr")
{
WO();
return false;
}

ptui_checkValidate();
kg(3);
return false;
}
else
{
var cwf=window.org_pass=S("pp").value,
ge=document.loginform;

if(!cwf)
{
WO("请输入独立密码");
setFocus("pp");
kg(3);
return false;
}
if(S("verifyinput").style.display!="none"&&!S("verifycode").value)
{
WO("请输入验证码");
setFocus("verifycode");
kg(3);
return false;
}

if(QMCFG.needEncrypt)
{
if(cwf.length>170)
{
ge.p.value=cwf;
}
else
{
var PublicKey="CF87D7B4C864F4842F1D337491A48FFF54B73A17300E8E42FA365420393AC0346AE55D8AFAD975DFA175FAF0106CBA81AF1DDE4ACEC284DAC6ED9A0D8FEB1CC070733C58213EFFED46529C54CEA06D774E3CC7E073346AEBD6C66FC973F299EB74738E400B22B1E7CDC54E71AED059D228DFEB5B29C530FF341502AE56DDCFE9",
PublicTs=ge.ts.value,
RSA=new RSAKey();
RSA.setPublic(PublicKey,"10001");

var Res=RSA.encrypt(ge.pp.value+'\n'+PublicTs+'\n');
if(Res)
{
ge.p.value=hex2b64(Res);
}
}




}
else
{
ge.p.value=cwf;
}

kg(4);
}
return true;
};
function ekm(jZ)
{
if(uI.beo==QMCFG.logintype)
{

setTimeout(function(){


if(!S('uin').value)
{
S('uin').value=S('u').value;
}

jZ&&jZ();
},500);
}
}
function il()
{
var aox=S('uin'),
cp=S('u1'),
dLA=S('remember'),

v=trim(aox.value.replace(/@.*$/g,''));

var cP=S('u').value=trim(aox.value);






{
var bAY=cP.split("@");

uI.yf=trim(bAY[0]);

if(bAY[1]=="vip.qq.com")
{
uI.bsD="vip";
}
else if(bAY[1]=="foxmail.com")
{
uI.bsD="fox";
}
else if(bAY[1]=="qq.com")
{
uI.bsD="";
}
else
{
uI.bsD=bAY[1]||"__noInput__";
}

uI.dIS="@"+bAY[1];
}


if(S('remerber_password')&&S('remerber_password').checked)
{
cp.value=cp.value+dLA.value;
}
else
{
cp.value=cp.value.replace(dLA.value,"");
}

cp.value=[
cp.value


.replace(/&clientaddr=[^&]*/gi,""),


'&clientaddr=',cP
].join("");





return true;
};
function byj(we)
{
var hG=document.getElementById('btlogin');
if(we)
{
hG.value="登录中";
hG.parentNode.className="login_btn_wrapper_disabled";
hG.setAttribute("loading",1)
}
else
{
hG.removeAttribute("loading");
hG.value="登录";
hG.parentNode.className="login_btn_wrapper";
}
}
function bmz(eqj,ers)
{
var gn=document.createElement("img"),
evf=QMCFG.servername+"/cgi-bin/getinvestigate?stat=newlogin&log1=#log1#&log2=#log2#&r=#random#";
gn.src=evf.replace("#log1#",eqj).replace("#log2#",ers).replace("#random#",Math.random());
show(gn,false);
document.body.appendChild(gn);








}
function eEq()
{
if(uI.coJ==10&&uI.xl==0)
{

bmz([uI.coJ+uI.xl,uI.yf,uI.bsD].join(","),[uI.ctz,""].join(","));
}


}
function kg(Ps,bCi)
{
uI.coJ=uI.beo==QMCFG.logintype?10:20;
uI.xl=Ps||0;
if(Ps==1)
{

uI.ctz=1;
}

if(Ps==4&&uI.beo==QMCFG.logintype)
{
bCi==uI.dyt&&uI.dsJ++;
bCi&&(uI.cGT=bCi);

bmz([uI.coJ+uI.xl,uI.yf,uI.bsD].join(","),[uI.ctz,uI.cGT].join(","));
}

else if(Ps==5&&uI.beo==QMCFG.logintype)
{
bmz([uI.coJ+uI.xl,uI.yf,uI.bsD].join(","),[uI.ctz,""].join(","));
}



};
function ecw(hS)
{

if(hS==uI.ekk)
{
kg(5);
}
else
{
kg(4,hS);
}
}
function eaU()
{

return(uI.dsJ>=uI.dSb
&&uI.cGT==uI.dyt
&&uI.xl==4);
}
function WO(msg)
{
msg=msg||"";
var BD=
{
errorUserName:"您输入的邮箱帐号不正确，请重新输入。",
emptyUserName:"请填写您的邮箱帐号。",
emptyPassword:"请填写邮箱密码。",
emptyVerifyCode:"请填写验证码。",
errorPassowrdTooLong:"邮箱密码不能超过100个字符。",
errorNamePassowrd:"您填写的帐号或密码不正确，请再次尝试。",
errorRequireSecondPassword:"请使用邮箱的“独立密码”登录。",
errorVerifyCode:"您填写的验证码不正确。",
frequent:"为了保障邮箱安全，请输入验证码。",
errorSecondPassword:"独立密码输入有误。",
errorSecondPwdNeedQQErr:"请先输入QQ密码。<br>为增强安全性，独立密码调整为“二次密码” <a href='http://service.mail.qq.com/cgi-bin/help?subtype=1&&id=7&&no=1000702' target='_blank'>了解更多</a>",
errorNeedQQProtect:'<p style="line-height:140%;">您的QQ帐号处于未保护状态，暂时无法登录。<br/><a onclick="ShowUrl($uin$)" style="text-decoration:underline;cursor:pointer;" >填写帐号保护资料</a></p>',
errorQQLock:'<p style="line-height:140%;">您的QQ帐号处于手机锁锁定状态，暂时无法登录。</p>',
errorQQLimit:"<p style='line-height:140%;'>很抱歉，您的QQ帐号存在安全风险。您暂时不能登录。请<a href='http://aq.qq.com/cn/services/abnormal/abnormal_index?source_id=2094&aquin="+QMCFG.qqnum+"' target='_blank' >点击这里解除登录限制</a>，之后才能正常登录。</p>",
errorBlockIPErr:"<p style='line-height:140%;'>您的电脑或所在网络出现了异常登录行为，为了您的帐号安全，暂时不能登录。<a href='http://service.mail.qq.com/cgi-bin/help?subtype=1&&id=7&&no=448' target='_blank' >怎么解决这个问题？</a></p>",
errorDistinctValid:"为了保障邮箱安全，请再次输入验证码登录。",
errorNeedJumpFoxmail:"请到www.foxmail.com登录该帐户",
errorPermissionDenied:"您没有权限登陆",
errorRelateSession:"因超时不能实现跳转。",
errorNotRelateUser:"不能跳转到非关联账户。"
},
crr=document.getElementById("msgContainer");

msg&&BD[msg]&&(msg=BD[msg]);

if(msg&&eaU())
{
msg=BD["errorSecondPwdNeedQQErr"]
}
crr.innerHTML=msg.replace(/[\,\.\!\?，。！]$/g,"");
crr.style.display=msg?"":"none";

byj(false);
}







extend(uI,{



dSb:3,
eyU:["@qq.com","@vip.qq.com","@foxmail.com","@rdgz.org"],
emG:["@qq.com","@vip.qq.com","@foxmail.com"],



ekk:"0",
dyt:"3",



eEj:"qm",
beo:"pt",





coJ:0,
xl:0,



dsJ:0,
ctz:0,
bsD:"",
dIS:"@qq.com",
cGT:"",
yf:""
},{














checkInput:dDJ,



judgeVC:cwq,



changeImg:bCx,



switchMode:aGo,




onLoadVC:esW,




onCallback:ecw,




onShowError:WO
});


(function initLogin()
{

kg();
QMCFG.init&&QMCFG.init();
extend(QMCFG.namespace,uI);



S('btlogin').onclick=function()
{
var hG=this;
if(hG.getAttribute("loading"))
{

clearTimeout(QMCFG.gnTimerSet||0);
QMCFG.gnTimerSet=setTimeout(function()
{
byj(false);
},5000);
return false;
}
else
{
byj(true);
}
};
detectCapsLock(S("p"));
LabelDisplay(["uin","p","pp","verifycode"]);
if(S("uin")&&S("uin").type=="text")
{
if(!S("uin").value)
{
setFocus("uin");
}
new AutoComplete(S("uin"),uI.emG,function()
{
setFocus("p");
}
);
}
else if(S("pp"))
{
setFocus("pp");
}
else
{
setFocus("p");
}


switch(QMCFG.errtype)
{
case"1":WO("errorNamePassowrd");break;
case"2":WO("errorVerifyCode");setFocus("verifycode");break;
case"3":WO("frequent");break;
case"4":WO('<span class="gray">您的邮箱在独立密码保护下，请输入您设置的独立密码</span>');break;
case"6":WO(QMCFG.valid_err?"您输入的独立密码有误，请重新输入":"请输入您的独立密码");break;
case"7":WO("errorSecondPwdNeedQQErr");break;
case"8":WO("errorBlockIPErr");break;
case"9":WO("errorNeedQQProtect");break;
case"10":WO("errorQQLock");break;
case"11":WO("errorQQLimit");break;
case"17":WO("errorDistinctValid");break;
case"18":WO("errorNeedJumpFoxmail");break;
case"47":WO("errorPermissionDenied");break;
case"-55":WO("errorRelateSession");break;
case"-56":WO("errorNotRelateUser");break;
default:

}
ekm(function()
{

cwq();
});

})();