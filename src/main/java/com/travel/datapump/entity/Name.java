
package com.travel.datapump.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name {
	@Column(name = "AA")
    private String ar;
	@Column(name = "BB")
    private String bg;
	@Column(name = "DD")
    private String de;
	@Column(name = "LE")
    private String el;
	@Column(name = "ENG")
    private String en;
	@Column(name = "EE")
    private String es;
	@Column(name = "FF")
    private String fr;
	@Column(name = "HH")
    private String hu;
	@Column(name = "II")
    private String it;
	@Column(name = "PP")
    private String pl;
	@Column(name = "TT")
    private String pt;
	@Column(name = "RR")
    private String ro;
	@Column(name = "UU")
    private String ru;
	@Column(name = "SS")
    private String sq;
	@Column(name = "RS")
    private String sr;
	@Column(name = "RT")
    private String tr;
    
	public String getAr() {
		return ar;
	}
	public void setAr(String ar) {
		this.ar = ar;
	}
	public String getBg() {
		return bg;
	}
	public void setBg(String bg) {
		this.bg = bg;
	}
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	public String getEl() {
		return el;
	}
	public void setEl(String el) {
		this.el = el;
	}
	public String getEn() {
		return en;
	}
	public void setEn(String en) {
		this.en = en;
	}
	public String getEs() {
		return es;
	}
	public void setEs(String es) {
		this.es = es;
	}
	public String getFr() {
		return fr;
	}
	public void setFr(String fr) {
		this.fr = fr;
	}
	public String getHu() {
		return hu;
	}
	public void setHu(String hu) {
		this.hu = hu;
	}
	public String getIt() {
		return it;
	}
	public void setIt(String it) {
		this.it = it;
	}
	public String getPl() {
		return pl;
	}
	public void setPl(String pl) {
		this.pl = pl;
	}
	public String getPt() {
		return pt;
	}
	public void setPt(String pt) {
		this.pt = pt;
	}
	public String getRo() {
		return ro;
	}
	public void setRo(String ro) {
		this.ro = ro;
	}
	public String getRu() {
		return ru;
	}
	public void setRu(String ru) {
		this.ru = ru;
	}
	public String getSq() {
		return sq;
	}
	public void setSq(String sq) {
		this.sq = sq;
	}
	public String getSr() {
		return sr;
	}
	public void setSr(String sr) {
		this.sr = sr;
	}
	public String getTr() {
		return tr;
	}
	public void setTr(String tr) {
		this.tr = tr;
	}
	public Name(String ar, String bg, String de, String el, String en, String es, String fr, String hu, String it,
			String pl, String pt, String ro, String ru, String sq, String sr, String tr) {
		super();
		this.ar = ar;
		this.bg = bg;
		this.de = de;
		this.el = el;
		this.en = en;
		this.es = es;
		this.fr = fr;
		this.hu = hu;
		this.it = it;
		this.pl = pl;
		this.pt = pt;
		this.ro = ro;
		this.ru = ru;
		this.sq = sq;
		this.sr = sr;
		this.tr = tr;
	}
	public Name() {
	
	}

    
}

