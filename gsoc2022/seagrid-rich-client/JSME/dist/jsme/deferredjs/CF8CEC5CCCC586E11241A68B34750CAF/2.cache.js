$wnd.jsme.runAsyncCallback2('var x4="Any",y4="Aromatic",z4="Nonring",A4="Reset",B4="Ring";function C4(a,b){if(0>b||b>=a.lb.options.length)throw new AD;}function D4(a,b){C4(a,b);return a.lb.options[b].value}function E4(){this.lb=$doc.createElement("<SELECT>");this.lb[Rh]="gwt-ListBox"}x(400,377,Bm,E4);function F4(){F4=y}\nfunction G4(a,b){if(null==b)throw new rA("Missing message: awt.103");var c=-1,d,e,f;f=a.rd.a.lb;e=hx(Wj);e.text=b;e.removeAttribute("bidiwrapped");e.value=b;d=f.options.length;(0>c||c>d)&&(c=d);c==d?f.add(e):(c=f.options[c])?f.add(e,c.index):f.add(e)}function H4(){F4();zG.call(this);new Fp;this.rd=new I4((AG(),this))}x(467,454,{57:1,59:1,66:1,83:1,93:1},H4);_.kf=function(){return FG(this.rd,this)};\n_.zf=function(){return(null==this.od&&(this.od=iG(this)),this.od)+Eb+this.zd+Eb+this.Ad+Eb+this.wd+Ml+this.ld+(this.vd?n:",hidden")+",current="+D4(this.rd.a,this.rd.a.lb.selectedIndex)};function J4(){u0.call(this,7)}x(481,1,Xm,J4);function K4(a){a.rd.eg(a.k);!kG(a)&&T_(a);N_(a)}\nfunction L4(a,b,c){H0.call(this);this.rd&&this.rd.fg(!1);m0(this,!1);OG(this,new u0(0));a=new x0(a,1);P_(this,a,null);a=new TG;P_(a,this.j,null);P_(this,a,null);b&&(this.k=oG(b),l0(this),G0(this.k,~~(bx(b.bd.lb,Qj)/2)-~~(this.wd/2),~~(bx(b.bd.lb,Pj)/2)-~~(this.ld/2)));c&&L_(this,c)}x(663,664,aY,L4);_.Hi=function(){return kY};x(698,590,bn);_.Zd=function(){K4(new L4(this.b,this.a,this.a.H))};x(700,590,bn);_.Zd=function(){this.a.yc?this.a.yc.rd.vf()?this.a.yc.rd.hg():K4(this.a.yc):this.a.yc=new M4(this.a)};\nfunction N4(a,b){I_(b)==a.a?L_(b,(oH(),zH)):L_(b,a.a)}\nfunction O4(a){var b,c,d,e;e=n;d=!1;I_(P4)!=a.a?(e=wb,d=!0):I_(Q4)!=a.a?(e="!#6",d=!0):I_(R4)!=a.a?(L_(S4,(oH(),zH)),L_(T4,zH),L_(U4,zH),L_(V4,zH),e="F,Cl,Br,I"):(b=I_(W4)!=a.a,c=I_(X4)!=a.a,I_(Y4)!=a.a&&(b?e+="c,":c?e+="C,":e+="#6,"),I_(Z4)!=a.a&&(b?e+="n,":c?e+="N,":e+="#7,"),I_($4)!=a.a&&(b?e+="o,":c?e+="O,":e+="#8,"),I_(a5)!=a.a&&(b?e+="s,":c?e+="S,":e+="#16,"),I_(b5)!=a.a&&(b?e+="p,":c?e+="P,":e+="#15,"),I_(S4)!=a.a&&(e+="F,"),I_(T4)!=a.a&&(e+="Cl,"),I_(U4)!=a.a&&(e+="Br,"),I_(V4)!=a.a&&(e+=\n"I,"),Pr(e,Eb)&&(e=Qr(e,0,e.length-1)),1>e.length&&!a.b&&(b?e=$g:c?e=Gd:(L_(P4,(oH(),zH)),e=wb)));b=n;d&&I_(W4)!=a.a&&(b+=";a");d&&I_(X4)!=a.a&&(b+=";A");I_(c5)!=a.a&&(b+=";R");I_(d5)!=a.a&&(b+=";!R");I_(P4)!=a.a&&0<b.length?e=Qr(b,1,b.length):e+=b;d=e5.rd.a.lb.selectedIndex;0<d&&(--d,e+=";H"+d);d=f5.rd.a.lb.selectedIndex;0<d&&(--d,e+=";D"+d);I_(g5)!=a.a&&(e=Rl);I_(h5)!=a.a&&(e=kd);I_(i5)!=a.a&&(e=Fd);I_(j5)!=a.a&&(e="!@");HI(a.e,e)}\nfunction k5(a){l5(a);m5(a);var b=e5.rd.a;C4(b,0);b.lb.options[0].selected=!0;b=f5.rd.a;C4(b,0);b.lb.options[0].selected=!0;L_(W4,a.a);L_(X4,a.a);L_(c5,a.a);L_(d5,a.a);L_(e5,a.a);L_(f5,a.a);n5(a)}function l5(a){L_(Y4,a.a);L_(Z4,a.a);L_($4,a.a);L_(a5,a.a);L_(b5,a.a);L_(S4,a.a);L_(T4,a.a);L_(U4,a.a);L_(V4,a.a)}function m5(a){L_(P4,a.a);L_(Q4,a.a);L_(R4,a.a)}function n5(a){L_(g5,a.a);L_(h5,a.a);L_(i5,a.a);L_(j5,a.a);a.b=!1}\nfunction M4(a){p0.call(this,"Atom/Bond Query");this.j=new g0(this.Hi());hH(this.s,new I0(this));this.c=a;this.a=a.H;this.d||(a=oG(a),this.d=new z0(a),G0(this.d,-150,10));this.k=this.d;OG(this,new J4);L_(this,this.a);a=new TG;OG(a,new VH(0,3,1));P_(a,new w0("Atom type :"),null);P4=new g0(x4);Q4=new g0("Any except C");R4=new g0("Halogen");P_(a,P4,null);P_(a,Q4,null);P_(a,R4,null);P_(this,a,null);a=new TG;OG(a,new VH(0,3,1));P_(a,new x0("Or select one or more from the list :",0),null);P_(this,a,null);\na=new TG;OG(a,new VH(0,3,1));Y4=new g0(de);Z4=new g0(Hf);$4=new g0(Of);a5=new g0(mg);b5=new g0(Wf);S4=new g0(Ne);T4=new g0(ue);U4=new g0(ce);V4=new g0(We);P_(a,Y4,null);P_(a,Z4,null);P_(a,$4,null);P_(a,a5,null);P_(a,b5,null);P_(a,S4,null);P_(a,T4,null);P_(a,U4,null);P_(a,V4,null);P_(this,a,null);a=new TG;OG(a,new VH(0,3,1));e5=new H4;G4(e5,x4);G4(e5,Oc);G4(e5,Tc);G4(e5,$c);G4(e5,ed);P_(a,new w0("Number of hydrogens :  "),null);P_(a,e5,null);P_(this,a,null);a=new TG;OG(a,new VH(0,3,1));f5=new H4;G4(f5,\nx4);G4(f5,Oc);G4(f5,Tc);G4(f5,$c);G4(f5,ed);G4(f5,hd);G4(f5,id);G4(f5,jd);P_(a,new x0("Number of connections :",0),null);P_(a,f5,null);P_(a,new x0(" (H\'s don\'t count.)",0),null);P_(this,a,null);a=new TG;OG(a,new VH(0,3,1));P_(a,new w0("Atom is :"),null);W4=new g0(y4);P_(a,W4,null);X4=new g0("Nonaromatic");P_(a,X4,null);c5=new g0(B4);P_(a,c5,null);d5=new g0(z4);P_(a,d5,null);P_(this,a,null);a=new TG;L_(a,GH(I_(this)));OG(a,new VH(0,3,1));P_(a,new w0("Bond is :"),null);g5=new g0(x4);P_(a,g5,null);h5=\nnew g0(y4);P_(a,h5,null);i5=new g0(B4);P_(a,i5,null);j5=new g0(z4);P_(a,j5,null);P_(this,a,null);a=new TG;OG(a,new VH(1,3,1));this.e=new JI(wb,20);P_(a,this.e,null);P_(a,new g0(A4),null);P_(a,this.j,null);P_(this,a,null);this.rd&&this.rd.fg(!1);m0(this,!1);l5(this);m5(this);n5(this);L_(W4,this.a);L_(X4,this.a);L_(c5,this.a);L_(d5,this.a);L_(e5,this.a);L_(f5,this.a);N4(this,P4);l0(this);this.rd.eg(this.k);!kG(this)&&T_(this);N_(this)}x(717,664,aY,M4);\n_.Ii=function(a,b){var c;Q(b,A4)?(k5(this),N4(this,P4),O4(this)):E(a.f,56)?(n5(this),fB(a.f)===fB(P4)?(l5(this),m5(this)):fB(a.f)===fB(Q4)?(l5(this),m5(this)):fB(a.f)===fB(R4)?(l5(this),m5(this)):fB(a.f)===fB(c5)?L_(d5,this.a):fB(a.f)===fB(d5)?(L_(c5,this.a),L_(W4,this.a)):fB(a.f)===fB(W4)?(L_(X4,this.a),L_(d5,this.a)):fB(a.f)===fB(X4)?L_(W4,this.a):fB(a.f)===fB(g5)||fB(a.f)===fB(h5)||fB(a.f)===fB(i5)||fB(a.f)===fB(j5)?(k5(this),this.b=!0):m5(this),N4(this,a.f),O4(this)):E(a.f,57)&&(n5(this),c=a.f,\n0==c.rd.a.lb.selectedIndex?L_(c,this.a):L_(c,(oH(),zH)),O4(this));107!=this.c.o&&(this.c.o=107,YG(this.c));return!0};_.a=null;_.b=!1;_.c=null;_.d=null;var P4=_.e=null,g5=null,Q4=null,W4=null,h5=null,U4=null,Y4=null,f5=null,e5=null,T4=null,S4=null,R4=null,V4=null,Z4=null,X4=null,d5=null,j5=null,$4=null,b5=null,c5=null,i5=null,a5=null;function I4(a){xW();zW.call(this);this.a=new E4;hD(this.a,new o5(this,a),(gZ(),gZ(),hZ))}x(770,768,{},I4);_.dg=function(){return this.a};_.a=null;\nfunction o5(a,b){this.a=a;this.b=b}x(771,1,{},o5);_.fe=function(a){AG();K0(a,this.b,D4(this.a.a,this.a.a.lb.selectedIndex))};_.a=null;_.b=null;x(810,777,{});_.hg=function(){z1(this.c)};Z(663);Z(717);Z(467);Z(770);Z(771);Z(400);U(YX)(2);\n//@ sourceURL=2.js\n')
