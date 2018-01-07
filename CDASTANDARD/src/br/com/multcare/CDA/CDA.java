package br.com.multcare.CDA;

import java.io.FileWriter;
import br.com.multcare.CDA.Wxml.TAG;

public class CDA {

	private String s0,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16;
	private String p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14;
	private String a1,a2,a3,a4,a5;
	private String AUT;
	private String r0,r1,r2,r3;
	private String c0,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14;
	private String v0,v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,v20,v21,v22;
	private String C110,C111;
	private String C20,C21;
	private String C30,C31,C32,C33,C34,C35,C36,C37,C38,C39,C310,C311,C312,C313,C314,C315,C316;
	private String C40,C41;
	private String C50,C51,C52;
	private String C60,C61,C62,C63,C64,C65,C66,C67,C68,C69,C610,C611,C612,C613,C614,C615,C616,C617,C618;
	private String C70,C71,C72;
	private String C80,C81,C82;

	public void CDA_HEADER(String REALMCODE,String TYPE_ID_ROOT,
	   String EXTENSION0,String TEMPLATE,String ID_ROOT,
	   String EXTENSION1,String CODE,String DISPLAY_NAME,String CODE_SYSTEM,
	   String CODE_SYSTEM_NAME,String EFFETIVE_TIME,String CONFIDENTIALY,
	   String DISPLAY_NAME0,String CODE_SYSTEM0,String CODE_SYSTEM_NAME0,
	   String SET_ID,String VERSION_NUMBER) {
		this.s0 = REALMCODE;
		this.s1 = TYPE_ID_ROOT;
		this.s2 = EXTENSION0;
		this.s3 = TEMPLATE;
		this.s4 = ID_ROOT;
		this.s5 = EXTENSION1;
		this.s6 = DISPLAY_NAME;
		this.s7 = CODE;
		this.s8 = CODE_SYSTEM;
		this.s9 = CODE_SYSTEM_NAME;
		this.s10 = EFFETIVE_TIME;
		this.s11 = CONFIDENTIALY;
		this.s12 = DISPLAY_NAME0;
		this.s13 = CODE_SYSTEM0;
		this.s14 = CODE_SYSTEM_NAME0;
		this.s15 = SET_ID;
		this.s16 = VERSION_NUMBER;
	}
	public void CDA_PATIENT(String ID_PATIENT,String ADDR,
		String PHONE,String NAME,String FAMILY,String ADMINISTRATIVE,
		String CODE_SYSTEM,String BIRTH,String MARITAL_STATUS,
		String RELIGIOUS_AFFILIATION,String RACE,String ETHNIC_GROUP,
		String NAME_BIRTH_PLACE,String ADDR_BIRTH_PLACE,String ID_EXTENSION0) {
		this.p0 = ID_PATIENT;
		this.p1 = ADDR;
		this.p2 = PHONE;
		this.p3 = NAME;
		this.p4 = FAMILY;
		this.p5 = ADMINISTRATIVE;
		this.p6 = CODE_SYSTEM;
		this.p7 = BIRTH;
		this.p8 = MARITAL_STATUS;
		this.p9 = RELIGIOUS_AFFILIATION;
		this.p10 = RACE;
		this.p11 = ETHNIC_GROUP;
		this.p12 = NAME_BIRTH_PLACE;
		this.p13 = ADDR_BIRTH_PLACE;
		this.p14 = ID_EXTENSION0;
	}
	public void CDA_AUTHOR(String CRM,String ADDR,
	    String PHONE,String NAME,String FAMILY) {
		this.a1 = CRM;
		this.a2 = ADDR;
		this.a3 = PHONE;
		this.a4 = NAME;
		this.a5 = FAMILY;
	}
	public void CDA_AUTHENTICATOR(String CODE) {
		this.AUT = CODE;
	}
	public void CDA_RELATED(String TYPE_CODE,String ID,String EXTENSION,String VERSION) {
		this.r0 = TYPE_CODE;
		this.r1 = ID;
		this.r2 = EXTENSION;
		this.r3 = VERSION;
	}
	public void CDA_COMPONENTOF(String ID_ROOT,String EXTENSION,
		String DATE,String ID,
		String STATE,String CITY,
		String POSTAL_CODE,String STREET_ADDRESS,
		String PHONE,String USE,String FAMILY,
		String NAME_1,String NAME_2,String SUFFIXE,String LOCATION) {
		this.c0 = ID_ROOT;
		this.c1 = EXTENSION;
		this.c2 = DATE;
		this.c3 = ID;
		this.c4 = STATE;
		this.c5 = CITY;
		this.c6 = POSTAL_CODE;
		this.c7 = STREET_ADDRESS;
		this.c8 = PHONE;
		this.c9 = USE;
		this.c10 = FAMILY;
		this.c11 = NAME_1;
		this.c12 = NAME_2;
		this.c13 = SUFFIXE;
		this.c14 = LOCATION;
	}
	public void CDA_PROBLEM(String SECTION,String MOODCODE,String TEMPLATE_ID,String CODE,
		String CODE_SYSTEM,String CODE_NAME,String DISPLAY_NAME,String TITLE,String TEXT,
		String ENTRY,String TEMPLATE_ID_ROOT,String ID,String CODE_CODE,String CODE_SYSTEM1,
		String STATUS_CODE,String LOW,String RELATION_CODE,String TEMPLATE_ROOT,String CODE1,
		String TEXT_MEDIA,String REFERENCE,String STATUS_CODE1,String VALUE_TYPE) {
		this.v0 = SECTION;
		this.v1 = MOODCODE;
		this.v2 = TEMPLATE_ID;
		this.v3 = CODE;
		this.v4 = CODE_SYSTEM;
		this.v5 = CODE_NAME;
		this.v6 = DISPLAY_NAME;
		this.v7 = TITLE;
		this.v8 = TEXT;
		this.v9 = ENTRY;
		this.v10 = TEMPLATE_ID_ROOT;
		this.v11 = ID;
		this.v12 = CODE_CODE;
		this.v13 = CODE_SYSTEM1;
		this.v14 = STATUS_CODE;
		this.v15 = LOW;
		this.v16 = RELATION_CODE;
		this.v17 = TEMPLATE_ROOT;
		this.v18 = CODE1;
		this.v19 = TEXT_MEDIA;
		this.v20 = REFERENCE;
		this.v21 = STATUS_CODE1;
		this.v22 = VALUE_TYPE;
	}
	public void CDA_HISTORY_DOCTOR(String TITLE,String CONTENT) {
		this.C110 = TITLE;
		this.C111 = CONTENT;
	}
	public void CDA_MEDICINES(String TITLE,String CONTENT) {
		this.C20 = TITLE;
		this.C21 = CONTENT;
	}
	public void CDA_ALLERGY(String TITLE,String REATION,String ID_ROOT1,
		String EXTENSION,String CODE1, String STATUS,String OBSERVATION,
		String ID_ROOT2,String VALUE_CODE,String CODE2,String REFERENCE,
		String ENTRY,String ID_ROOT3,String CODE3,String TYPE,
		String CODE4,String CODE_SYSTEM_NAME) {
		this.C30 = TITLE;
		this.C31 = REATION;
		this.C32 = ID_ROOT1;
		this.C33 = EXTENSION;
		this.C34 = CODE1;
		this.C35 = STATUS;
		this.C36 = OBSERVATION;
		this.C37 = ID_ROOT2;
		this.C38 = VALUE_CODE;
		this.C39 = CODE2;
		this.C310= REFERENCE;
		this.C311= ENTRY;
		this.C312 = ID_ROOT3;
		this.C313 = CODE3;
		this.C314 = TYPE;
		this.C315 = CODE4;
		this.C316 = CODE_SYSTEM_NAME;
	}
	public void CDA_HISTORY_FAMILY(String TITLE,String CONTENT) {
		this.C40 = TITLE;
		this.C41 = CONTENT;
	}
	public void CDA_EXAMS(String TITLE,String CONTENT_1,String CONTENT_2) {
		this.C50 = TITLE;
		this.C51 = CONTENT_1;
		this.C52 = CONTENT_2;
	}
	public void CDA_EXAMS_LAB(String ID_ROOT1,String CODE1,String DISPLAY_NAME1,
		String CONTENT_1,String CONTENT_2,String ORGANIZER,String ID_ROOT2,
		String EXTENSION,String CODE2,String DISPLAY_NAME2,String ID_ROOT3,
		String ORIGINAL_TEXT,String TEXT,String EFFETIVE_VALUE,String CODE3,
		String LAB_NAME,String TXT,String TEXT2,String MMOL) {
		this.C60 = ID_ROOT1;
		this.C61 = CODE1;
		this.C62= DISPLAY_NAME1;
		this.C63 = CONTENT_1;
		this.C64 = CONTENT_2;
		this.C65 = ORGANIZER;
		this.C66 = ID_ROOT2;
		this.C67 = EXTENSION;
		this.C68 = CODE2;
		this.C69 = DISPLAY_NAME2;
		this.C610 = ID_ROOT3;
		this.C611 = ORIGINAL_TEXT;
		this.C612 = TEXT;
		this.C613 = EFFETIVE_VALUE;
		this.C614 = CODE3;
		this.C615 = LAB_NAME;
		this.C616 = TXT;
		this.C617 = TEXT2;
		this.C618 = MMOL;
	}
	public void CDA_DIAGNOSTIC(String TITLE, String CONTENT_1,String CONTENT_2) {
		this.C70 = TITLE;
		this.C71 = CONTENT_1;
		this.C72 = CONTENT_2;
	}
	public void CDA_TRATAMENT(String TITLE, String CONTENT_1,String CONTENT_2) {
		this.C80 = TITLE;
		this.C81 = CONTENT_1;
		this.C82 = CONTENT_2;
	}
	public void CREATE_STANDARD(String file) {
		Wxml wcda = new Wxml();

		TAG CD = wcda.xml_CREATE("ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' classCode='DOCCLIN'","");
		TAG C1 = wcda.xml_CREATE("realmCode code='"+s0+"'","");
		TAG C2 = wcda.xml_CREATE("typeId root='2.16.840.1.113883."+s1+"' extension='"+s2+"'","");
		TAG C3 = wcda.xml_CREATE("templateId root='2.16.840.1.113883."+s3+"'","");
		TAG C4 = wcda.xml_CREATE("id root='"+s4+"' extension='2.16.840.1.113883."+s5+"'","");
		TAG C5 = wcda.xml_CREATE("code code='"+s6+"' displayName='"+s7+"' codeSystem='2.16.840.1.113883."+s8+"' codeSystemName='"+s9+"'","");
		TAG C6 = wcda.xml_CREATE("effectiveTime value=\""+s10+"\"","");
		TAG C7 = wcda.xml_CREATE("confidentialityCode code=\""+s11+"\" displayName='"+s12+"' codeSystem='2.16.840.1.113883."+s13+"' codeSystemName='"+s14+"'","");
		TAG C8 = wcda.xml_CREATE("setId extension=\""+s15+"\" root=\"2.16.840.1.113883."+s5+"\"","");
		TAG C9 = wcda.xml_CREATE("versionNumber value=\""+s16+"\"","");
		TAG C10 =wcda.xml_CREATE("copyTime value='"+s10+"'","");
		
		TAG A0 = wcda.xml_CREATE("author","");
		TAG A1 = wcda.xml_CREATE("time value = \""+s10+"\"", "");
		TAG A2 = wcda.xml_CREATE("assignedAuthor","");
		TAG A3 = wcda.xml_CREATE("id root='2.16.840.1.113883."+s5+"' extension='"+a1+"'", "");
		TAG A4 = wcda.xml_CREATE("addr", ""+a2+"");
		TAG A5 = wcda.xml_CREATE("telecom value = '"+a3+"'","");
		TAG A6 = wcda.xml_CREATE("assignedPerson", "");
		TAG A7 = wcda.xml_CREATE("name","");
		TAG A8 = wcda.xml_CREATE("given",""+a4+"");
		TAG A9 = wcda.xml_CREATE("family",""+a5+"");

		TAG CS0 = wcda.xml_CREATE("custodian", "");
		TAG CS1 = wcda.xml_CREATE("assignedCustodian","");
		TAG CS2 = wcda.xml_CREATE("representedCustodianOrganization","");
		TAG CS3 = wcda.xml_CREATE("id extension=\""+p14+"\" root=\"2.16.840.1.113883."+s5+"\"", "");
		TAG CS4 = wcda.xml_CREATE("name", "MultCare");

		TAG L0 = wcda.xml_CREATE("legalAuthenticator", "");
		TAG L1 = wcda.xml_CREATE("time value=\""+s10+"\"", "");
		TAG L2 = wcda.xml_CREATE("signatureCode code=\""+AUT+"\"","");
		TAG L3 = wcda.xml_CREATE("assignedEntity", "");
		TAG L4 = wcda.xml_CREATE("id extension=\""+a1+"\" root=\"2.16.840.1.113883."+s5+"\"","");
		TAG L5 = wcda.xml_CREATE("assignedPerson","");
		TAG L6 = wcda.xml_CREATE("name","");
		TAG L7 = wcda.xml_CREATE("given", ""+a4+"");
		TAG L8 = wcda.xml_CREATE("family",""+a5+"");

		TAG R0 = wcda.xml_CREATE("relatedDocument typeCode=\""+r0+"\"", "");
		TAG R1 = wcda.xml_CREATE("parentDocument","");
		TAG R2 = wcda.xml_CREATE("id extension=\""+r1+"\" root=\"2.16.840.1.113883."+s5+"\"", "");
		TAG R3 = wcda.xml_CREATE("setId extension=\""+r2+"\" root=\"2.16.840.1.113883."+s5+"\"", "");
		TAG R4 = wcda.xml_CREATE("versionNumber value=\""+r3+"\"", "");

		TAG OFF0 =wcda.xml_CREATE("componentOf","");
		TAG OFF1 =wcda.xml_CREATE("encompassingEncounter", "");
		TAG OFF2 =wcda.xml_CREATE("id root=\""+c0+"\" extension=\""+c1+"\"", "");
		TAG OFF3 =wcda.xml_CREATE("effectiveTime value=\""+c2+"\"","");
		TAG OFF4 =wcda.xml_CREATE("responsibleParty","");
		TAG OFF5 =wcda.xml_CREATE("assignedEntity", "");
		TAG OFF6 =wcda.xml_CREATE("id nullFlavor=\""+c3+"\"", "");
		TAG OFF7 =wcda.xml_CREATE("addr","");
		TAG OFF8 =wcda.xml_CREATE("state", ""+c4+"");
		TAG OFF9 =wcda.xml_CREATE("city",""+c5+"");
		TAG OFF10 =wcda.xml_CREATE("postalCode", ""+c6+"");
		TAG OFF11 =wcda.xml_CREATE("streetAddressLine", ""+c7+"");
		TAG OFF12 =wcda.xml_CREATE("telecom value=\"tel:"+c8+"\" use=\""+c9+"\"", "");
		TAG OFF13 =wcda.xml_CREATE("assignedPerson", "");
		TAG OFF14 =wcda.xml_CREATE("name","");
		TAG OFF15 =wcda.xml_CREATE("family", ""+c10+"");
		TAG OFF16 =wcda.xml_CREATE("given", ""+c11+"");
		TAG OFF17 =wcda.xml_CREATE("given", ""+c12+"");
		TAG OFF18 =wcda.xml_CREATE("suffix", ""+c13+"");
		TAG OFF19 =wcda.xml_CREATE("location","");
		TAG OFF20 =wcda.xml_CREATE("healthCareFacility", "");
		TAG OFF21 =wcda.xml_CREATE("id root=\""+c0+"\" extension=\""+c1+"\"", "");
		TAG OFF22 =wcda.xml_CREATE("location","");
		TAG OFF23 =wcda.xml_CREATE("name", ""+c14+"");
		TAG OFF24 =wcda.xml_CREATE("addr", "");
		TAG OFF25 =wcda.xml_CREATE("state", ""+c4+"");
		TAG OFF26 =wcda.xml_CREATE("city",""+c5+"");
		TAG OFF27 =wcda.xml_CREATE("postalCode", ""+c6+"");
		TAG OFF28 =wcda.xml_CREATE("streetAddressLine",""+c7+"");

		TAG CO0 =wcda.xml_CREATE("component", "");
		TAG CO1 =wcda.xml_CREATE("structuredBody", "");
		TAG CO2 =wcda.xml_CREATE("languageCode code=\"pt-BR\"","");
		TAG CO3 =wcda.xml_CREATE("component", "");
		TAG CO4 =wcda.xml_CREATE("section classCode=\""+v0+"\" moodCode=\""+v1+"\"","");
		TAG CO5 =wcda.xml_CREATE("templateId root=\"2.16.840.1.113883."+v2+"\"", ""); 
		TAG CO6 =wcda.xml_CREATE("code code=\""+v3+"\" codeSystem=\"2.16.840.1.113883."+v4+"\" codeSystemName=\""+v5+"\" displayName=\""+v6+"\"","");
		TAG CO7 =wcda.xml_CREATE("title", ""+v7+""); 
		TAG CO8 =wcda.xml_CREATE("text", ""+v8+"");  
		TAG CO9 =wcda.xml_CREATE("entry typeCode=\""+v9+"\"", ""); 
		TAG CO10 =wcda.xml_CREATE("act classCode=\"ACT\" moodCode=\""+v1+"\"", "");
		TAG CO11 =wcda.xml_CREATE("templateId root=\"2.16.840.1.113883."+v10+"\"",""); 
		TAG CO12 =wcda.xml_CREATE("id nullFlavor=\""+v11+"\"", "");
		TAG CO13 =wcda.xml_CREATE("code code=\""+v12+"\" codeSystem=\"2.16.840.1.113883."+v13+"\"",""); 
		TAG CO14 =wcda.xml_CREATE("statusCode code=\""+v14+"\"", ""); 
		TAG CO15 = wcda.xml_CREATE("effectiveTime", "");
		TAG CO16 = wcda.xml_CREATE("low value=\""+v15+"\"",""); 
		TAG CO17 = wcda.xml_CREATE("entryRelationship typeCode=\""+v16+"\" inversionInd=\"false\"", ""); 
		TAG CO18 = wcda.xml_CREATE("observation classCode=\"OBS\" moodCode=\""+v1+"\"","");
		TAG CO19 = wcda.xml_CREATE("templateId root=\"2.16.840.1.113883."+v17+"\"",""); 
		TAG CO20 = wcda.xml_CREATE("id nullFlavor=\""+v11+"\"", "");
		TAG CO21 = wcda.xml_CREATE("code code=\"ASSERTION\" codeSystem=\"2.16.840.1.113883."+v18+"\"",""); 
		TAG CO22 = wcda.xml_CREATE("text mediaType=\""+v19+"\"", ""); 
		TAG CO23 =wcda.xml_CREATE("reference value=\""+v20+"\"", ""); 
		TAG CO24 =wcda.xml_CREATE("statusCode code=\""+v21+"\"", ""); 
		TAG CO25 =wcda.xml_CREATE("effectiveTime", "");
		TAG CO26 =wcda.xml_CREATE("low value=\""+v15+"\"", "");
		TAG CO27 =wcda.xml_CREATE("value xsi:type=\""+v22+"\" nullFlavor=\""+c3+"\"", ""); 

		TAG P19 =wcda.xml_CREATE("recordTarget","");
		TAG P20 =wcda.xml_CREATE("patientRole","");
		TAG P0 = wcda.xml_CREATE("id extension=\""+p0+"\" root=\"2.16.840.1.113883."+s5+"\"","");
		TAG P1 = wcda.xml_CREATE("addr ",""+p1+"");
		TAG P2 = wcda.xml_CREATE("telecom value=\""+p2+"\"","");
		TAG P3 = wcda.xml_CREATE("patient","");
		TAG P4 = wcda.xml_CREATE("name","");
		TAG P17 =wcda.xml_CREATE("given",""+p3+"");
		TAG P18 =wcda.xml_CREATE("family",""+p4+"");
		TAG P5 = wcda.xml_CREATE("administrativeGenderCode code=\""+p5+"\" codeSystem=\"2.16.840.1.113883."+p6+"\"",""); 
		TAG P6 = wcda.xml_CREATE("birthTime value=\""+p7+"\"","");
		TAG P7 = wcda.xml_CREATE("maritalStatusCode code='"+p8+"'","");
		TAG P8 = wcda.xml_CREATE("religiousAffiliationCode code='"+p9+"'","");
		TAG P9 = wcda.xml_CREATE("raceCode code='"+p10+"'","");
		TAG P10 =wcda.xml_CREATE("ethnicGroupCode code='"+p11+"'","");
		TAG P11 =wcda.xml_CREATE("birthplace","");
		TAG P12 =wcda.xml_CREATE("place","");
		TAG P13 =wcda.xml_CREATE("name ",""+p12+"");
		TAG P14 =wcda.xml_CREATE("addr ", ""+p13+"");
		TAG P15 =wcda.xml_CREATE("providerOrganization","");
		TAG P16 =wcda.xml_CREATE("id extension=\""+p14+"\" root=\"2.16.840.1.113883."+s5+"\"","");

		TAG COMP80 = wcda.xml_CREATE("component","");
		TAG COMP81 = wcda.xml_CREATE("section","");
		TAG COMP82 = wcda.xml_CREATE("title",""+C80+"");
		TAG COMP83 = wcda.xml_CREATE("text","");
		TAG COMP84 = wcda.xml_CREATE("list","");
		TAG COMP85 = wcda.xml_CREATE("item","");
		TAG COMP86 = wcda.xml_CREATE("content",""+C81+"");
		TAG COMP87 = wcda.xml_CREATE("item","");
		TAG COMP88 = wcda.xml_CREATE("content",""+C82+"");
		//TAG COMP89 = wcda.xml_CREATE("entry","");
		
		TAG COMP70 = wcda.xml_CREATE("component","");
		TAG COMP71 = wcda.xml_CREATE("section","");
		TAG COMP72 = wcda.xml_CREATE("title",""+C70+"");
		TAG COMP73 = wcda.xml_CREATE("text","");
		TAG COMP74 = wcda.xml_CREATE("list","");
		TAG COMP75 = wcda.xml_CREATE("item","");
		TAG COMP76 = wcda.xml_CREATE("content",""+C71+"");
		TAG COMP77 = wcda.xml_CREATE("item","");
		TAG COMP78 = wcda.xml_CREATE("content",""+C72+"");
		//TAG COMP79 = wcda.xml_CREATE("entry","");
		
		TAG COMP60 = wcda.xml_CREATE("component","");
		TAG COMP61 = wcda.xml_CREATE("section classCode=\""+v0+"\" moodCode=\""+v1+"\"","");
		TAG COMP62 = wcda.xml_CREATE("templateId root=\"2.16.840.1.113883."+C60+"\"","");  
		TAG COMP63 = wcda.xml_CREATE("code code=\""+C61+"\" codeSystem=\"2.16.840.1.113883."+v4+"\" codeSystemName=\""+v5+"\" displayName=\""+C62+"\"",""); 
		TAG COMP64 =  wcda.xml_CREATE("title",""+C62+"");
		TAG COMP65 =  wcda.xml_CREATE("text","");
		TAG COMP66 =  wcda.xml_CREATE("list","");
		TAG COMP67 =  wcda.xml_CREATE("item","");
		TAG COMP68 =  wcda.xml_CREATE("content",""+C63+""); 
		TAG COMP69 =  wcda.xml_CREATE("item","");
		TAG COMP610 =  wcda.xml_CREATE("content",""+C64+""); 
		TAG COMP611 =  wcda.xml_CREATE("entry typeCode=\""+v9+"\"","");
		TAG COMP612 = wcda.xml_CREATE("organizer classCode=\""+C65+"\" moodCode=\""+v1+"\"","");   
		TAG COMP613 = wcda.xml_CREATE("templateId root=\"2.16.840.1.113883."+C66+"\"","");    
		TAG COMP614 = wcda.xml_CREATE("id root=\""+c0+"\" extension=\""+C67+"\"","");  
		TAG COMP615 = wcda.xml_CREATE("code code=\""+C68+"\" codeSystem=\"2.16.840.1.113883."+v4+"\" codeSystemName=\""+v5+"\" displayName=\""+C69+"\"","");    
		TAG COMP616 = wcda.xml_CREATE("statusCode code=\""+v21+"\"","");
		TAG COMP617 = wcda.xml_CREATE("component", "");
		TAG COMP618 = wcda.xml_CREATE("observation classCode=\"OBS\" moodCode=\""+v1+"\"","");
		TAG COMP619 = wcda.xml_CREATE("templateId root=\"2.16.840.1.113883."+C610+"\"","");
		TAG COMP620 = wcda.xml_CREATE("id root=\""+c0+"\" extension=\""+C67+"\"","");
		TAG COMP621 = wcda.xml_CREATE("code code=\""+C68+"\" codeSystem=\"2.16.840.1.113883."+v4+"\" codeSystemName=\""+v5+"\" displayName=\""+C69+"\"","");
		TAG COMP622 = wcda.xml_CREATE("originalText",""+C611+"");
		TAG COMP623 = wcda.xml_CREATE("text mediaType=\""+C612+"\"",""); 
		TAG COMP624 = wcda.xml_CREATE("reference value=\"#Result-"+C67+"\"","");
		TAG COMP625 = wcda.xml_CREATE("statusCode code=\""+v21+"\"","");
		TAG COMP626 = wcda.xml_CREATE("effectiveTime value=\""+C613+"\"",""); 
		TAG COMP627 = wcda.xml_CREATE("value  xsi:type=\"PQ\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" value=\"141\" unit=\"mg/dl\"","");
		TAG COMP628 = wcda.xml_CREATE("entryRelationship typeCode=\"REFR\" contextConductionInd=\"true\"","");
		TAG COMP629 = wcda.xml_CREATE("observation classCode=\"OBS\" moodCode=\""+v1+"\"","");
		TAG COMP630 = wcda.xml_CREATE("code code=\""+C614+"\" codeSystem=\"2.16.840.1.113883."+v4+"\" codeSystemName=\""+v5+"\" displayName=\"Information source\"",""); 
		TAG COMP631 = wcda.xml_CREATE("statusCode code=\""+v21+"\"","");
		TAG COMP632 = wcda.xml_CREATE("value  xsi:type=\"ST\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"",""+C615+""); 
		TAG COMP633 = wcda.xml_CREATE("referenceRange typeCode=\"REFV\"","");
		TAG COMP634 = wcda.xml_CREATE("observationRange classCode=\"OBS\" moodCode=\"EVN.CRT\"","");
		TAG COMP635 = wcda.xml_CREATE("text representation=\""+C616+"\" mediaType=\""+C617+"\"",""+C618+"");

		TAG COMP50 = wcda.xml_CREATE("component","");
		TAG COMP51 = wcda.xml_CREATE("section","");
		TAG COMP52 = wcda.xml_CREATE("title",""+C50+"");
		TAG COMP53 = wcda.xml_CREATE("text","");
		TAG COMP54 = wcda.xml_CREATE("list","");
		TAG COMP55 = wcda.xml_CREATE("item","");
		TAG COMP56 = wcda.xml_CREATE("content",""+C51+"");
		TAG COMP57 = wcda.xml_CREATE("item","");
		TAG COMP58 = wcda.xml_CREATE("content",""+C52+"");
		//TAG COMP59 = wcda.xml_CREATE("entry","");
		
		TAG COMP40 = wcda.xml_CREATE("component","");
		TAG COMP41 = wcda.xml_CREATE("section","");
		TAG COMP42 = wcda.xml_CREATE("title",""+C40+"");
		TAG COMP43 = wcda.xml_CREATE("text","");
		TAG COMP44 = wcda.xml_CREATE("list","");
		TAG COMP45 = wcda.xml_CREATE("item","");
		TAG COMP46 = wcda.xml_CREATE("content",""+C41+"");
		//TAG COMP47 = wcda.xml_CREATE("entry","");
		
		TAG COMP30 = wcda.xml_CREATE("component","");
		TAG COMP31 = wcda.xml_CREATE("section classCode=\""+v0+"\" moodCode=\""+v1+"\"","");
		TAG COMP32 = wcda.xml_CREATE("title",""+C30+"");
		TAG COMP33 = wcda.xml_CREATE("text","");
		TAG COMP34 = wcda.xml_CREATE("list","");
		TAG COMP35 = wcda.xml_CREATE("item","");
		TAG COMP36 = wcda.xml_CREATE("content",""+C31+"");
		TAG COMP37 = wcda.xml_CREATE("entry typeCode=\""+v9+"\"","");
		TAG COMP38 = wcda.xml_CREATE("act classCode=\"ACT\" moodCode=\""+v1+"\"","");
		TAG COMP39 = wcda.xml_CREATE("templateId root=\"2.16.840.1.113883."+C32+"\"","");
		TAG COMP310 = wcda.xml_CREATE("id root=\""+c0+"\" extension=\""+C33+"\"","");
		TAG COMP311 = wcda.xml_CREATE("code code=\""+C34+"\" codeSystem=\"2.16.840.1.113883."+v4+"\" codeSystemName=\""+v5+"\" displayName=\""+C30+"\"",""); 
		TAG COMP312 = wcda.xml_CREATE("statusCode code=\""+C35+"\"","");
		TAG COMP313 = wcda.xml_CREATE("effectiveTime","");
		TAG COMP314 = wcda.xml_CREATE("low value=\""+v15+"\"","");
		TAG COMP315 = wcda.xml_CREATE("entryRelationship typeCode=\""+v16+"\"","");
		TAG COMP316 = wcda.xml_CREATE("observation nullFlavor=\""+C36+"\" classCode=\"OBS\" moodCode=\""+v1+"\"",""); 
		TAG COMP317 = wcda.xml_CREATE("templateId root=\"2.16.840.1.113883."+C37+"\"","");
		TAG COMP318 = wcda.xml_CREATE("id root=\""+c0+"\" extension=\""+C33+"\"","");
		TAG COMP319 = wcda.xml_CREATE("code code=\"ASSERTION\" codeSystem=\"2.16.840.1.113883."+v18+"\" codeSystemName=\"ActCode\"","");
		TAG COMP320 = wcda.xml_CREATE("statusCode code=\""+v21+"\"","");
		TAG COMP321 = wcda.xml_CREATE("effectiveTime","");
		TAG COMP322 = wcda.xml_CREATE("low value=\""+v15+"\"","");
		TAG COMP323 = wcda.xml_CREATE("value xsi:type=\"CD\" code=\""+C38+"\" codeSystem=\"2.16.840.1.113883."+C39+"\"",""); 
		TAG COMP324 = wcda.xml_CREATE("originalText","");
		TAG COMP325 = wcda.xml_CREATE("reference value=\""+C310+"\"","");  
		TAG COMP326 = wcda.xml_CREATE("entryRelationship typeCode=\""+v16+"\" inversionInd=\""+C311+"\"",""); 
		TAG COMP327 = wcda.xml_CREATE("observation classCode=\"OBS\" moodCode=\""+v1+"\"","");
		TAG COMP328 = wcda.xml_CREATE("templateId root=\"2.16.840.1.113883."+C312+"\"","");
		TAG COMP329 = wcda.xml_CREATE("code code=\""+C313+"\" codeSystem=\"2.16.840.1.113883."+v4+"\"",""); 
		TAG COMP330 = wcda.xml_CREATE("statusCode code=\""+v21+"\"","");
		TAG COMP331 = wcda.xml_CREATE("value xsi:type=\""+C314+"\" code=\""+C315+"\" codeSystem=\"2.16.840.1.113883."+C39+"\" codeSystemName=\""+C316+"\" displayName=\""+v14+"\"","");       
		
		TAG COMP20 = wcda.xml_CREATE("component","");
		TAG COMP21 = wcda.xml_CREATE("section","");
		TAG COMP22 = wcda.xml_CREATE("title",""+C20+"");
		TAG COMP23 = wcda.xml_CREATE("text","");
		TAG COMP24 = wcda.xml_CREATE("list","");
		TAG COMP25 = wcda.xml_CREATE("item","");
		TAG COMP26 = wcda.xml_CREATE("content",""+C21+"");
		//TAG COMP27 = wcda.xml_CREATE("entry","");

		TAG COMP10 = wcda.xml_CREATE("component","");
		TAG COMP11 = wcda.xml_CREATE("section","");
		TAG COMP12 = wcda.xml_CREATE("title",""+C110+"");
		TAG COMP13 = wcda.xml_CREATE("text","");
		TAG COMP14 = wcda.xml_CREATE("list","");
		TAG COMP15 = wcda.xml_CREATE("item","");
		TAG COMP16 = wcda.xml_CREATE("content",""+C111+"");
		//TAG COMP17 = wcda.xml_CREATE("entry","");

		wcda.xml_INSERT(P15,P16);
		wcda.xml_INSERT(P20,P15);
		wcda.xml_INSERT(P12,P14);
		wcda.xml_INSERT(P12,P13);
		wcda.xml_INSERT(P11,P12);
		wcda.xml_INSERT(P3,P11);
		wcda.xml_INSERT(P3,P10);
		wcda.xml_INSERT(P3,P9);
		wcda.xml_INSERT(P3,P8);
		wcda.xml_INSERT(P3,P7);
		wcda.xml_INSERT(P3,P6);
		wcda.xml_INSERT(P3,P5);
		wcda.xml_INSERT(P4,P18);
		wcda.xml_INSERT(P4,P17);
		wcda.xml_INSERT(P3, P4);
		wcda.xml_INSERT(P20,P3);
		wcda.xml_INSERT(P20,P2);
		wcda.xml_INSERT(P20,P1);
		wcda.xml_INSERT(P20,P0);
		wcda.xml_INSERT(P19,P20);

		wcda.xml_INSERT(A7, A9);
		wcda.xml_INSERT(A7, A8);
		wcda.xml_INSERT(A6, A7);
		wcda.xml_INSERT(A2, A6);
		wcda.xml_INSERT(A2, A5);
		wcda.xml_INSERT(A2, A4);
		wcda.xml_INSERT(A2, A3);
		wcda.xml_INSERT(A0, A2);
		wcda.xml_INSERT(A0, A1);

		wcda.xml_INSERT(CS2, CS4);
		wcda.xml_INSERT(CS2, CS3);
		wcda.xml_INSERT(CS1, CS2);
		wcda.xml_INSERT(CS0, CS1);

		wcda.xml_INSERT(L6, L8);
		wcda.xml_INSERT(L6, L7);
		wcda.xml_INSERT(L5, L6);
		wcda.xml_INSERT(L3, L5);
		wcda.xml_INSERT(L3, L4);
		wcda.xml_INSERT(L0,L3);
		wcda.xml_INSERT(L0, L2);
		wcda.xml_INSERT(L0, L1);

		wcda.xml_INSERT(R1, R4);
		wcda.xml_INSERT(R1, R3);
		wcda.xml_INSERT(R1, R2);
		wcda.xml_INSERT(R0, R1);

		wcda.xml_INSERT(OFF24,OFF28);
		wcda.xml_INSERT(OFF24,OFF27);
		wcda.xml_INSERT(OFF24,OFF26);
		wcda.xml_INSERT(OFF24,OFF25);
		wcda.xml_INSERT(OFF22,OFF24);
		wcda.xml_INSERT(OFF22,OFF23);
		wcda.xml_INSERT(OFF20,OFF22);
		wcda.xml_INSERT(OFF20,OFF21);
		wcda.xml_INSERT(OFF19,OFF20);
		wcda.xml_INSERT(OFF14,OFF18);
		wcda.xml_INSERT(OFF14,OFF17);
		wcda.xml_INSERT(OFF14,OFF16);
		wcda.xml_INSERT(OFF14,OFF15);
		wcda.xml_INSERT(OFF13,OFF14);
		wcda.xml_INSERT(OFF7, OFF11);
		wcda.xml_INSERT(OFF7, OFF10);
		wcda.xml_INSERT(OFF7, OFF9);
		wcda.xml_INSERT(OFF7, OFF8);
		wcda.xml_INSERT(OFF5, OFF13);
		wcda.xml_INSERT(OFF5, OFF12);
		wcda.xml_INSERT(OFF5, OFF7);
		wcda.xml_INSERT(OFF5, OFF6);
		wcda.xml_INSERT(OFF4, OFF5);
		wcda.xml_INSERT(OFF1, OFF19);
		wcda.xml_INSERT(OFF1, OFF4);
		wcda.xml_INSERT(OFF1, OFF3);
		wcda.xml_INSERT(OFF1, OFF2);
		wcda.xml_INSERT(OFF0, OFF1);

		wcda.xml_INSERT(COMP87, COMP88);
		wcda.xml_INSERT(COMP84, COMP87);
		wcda.xml_INSERT(COMP85, COMP86);
		wcda.xml_INSERT(COMP84, COMP85);
		wcda.xml_INSERT(COMP83, COMP84);
		//wcda.xml_INSERT(COMP81, COMP89);
		wcda.xml_INSERT(COMP81, COMP83);
		wcda.xml_INSERT(COMP81, COMP82);
		wcda.xml_INSERT(COMP80, COMP81);
		wcda.xml_INSERT(CO1,    COMP80);
		
		wcda.xml_INSERT(COMP77, COMP78);
		wcda.xml_INSERT(COMP74, COMP77);
		wcda.xml_INSERT(COMP75, COMP76);
		wcda.xml_INSERT(COMP74, COMP75);
		wcda.xml_INSERT(COMP73, COMP74);
		//wcda.xml_INSERT(COMP71, COMP79);
		wcda.xml_INSERT(COMP71, COMP73);
		wcda.xml_INSERT(COMP71, COMP72);
		wcda.xml_INSERT(COMP70, COMP71);
		wcda.xml_INSERT(CO1,    COMP70);
	
		wcda.xml_INSERT(COMP634, COMP635);
		wcda.xml_INSERT(COMP633, COMP634);
		wcda.xml_INSERT(COMP618, COMP633);
		wcda.xml_INSERT(COMP629, COMP632);
		wcda.xml_INSERT(COMP629, COMP631);
		wcda.xml_INSERT(COMP629, COMP630);
		wcda.xml_INSERT(COMP628, COMP629);
		wcda.xml_INSERT(COMP618, COMP628);
		wcda.xml_INSERT(COMP618, COMP627);
		wcda.xml_INSERT(COMP618, COMP626);
		wcda.xml_INSERT(COMP618, COMP625);
		wcda.xml_INSERT(COMP623, COMP624);
		wcda.xml_INSERT(COMP618, COMP623);
		wcda.xml_INSERT(COMP621, COMP622);
		wcda.xml_INSERT(COMP618, COMP621);
		wcda.xml_INSERT(COMP618, COMP620);
		wcda.xml_INSERT(COMP618, COMP619);
		wcda.xml_INSERT(COMP617, COMP618);
		wcda.xml_INSERT(COMP612, COMP617);
		wcda.xml_INSERT(COMP612, COMP616);
		wcda.xml_INSERT(COMP612, COMP615);
		wcda.xml_INSERT(COMP612, COMP614);
		wcda.xml_INSERT(COMP612, COMP613);
		wcda.xml_INSERT(COMP611, COMP612);
		wcda.xml_INSERT(COMP61, COMP611);
		wcda.xml_INSERT(COMP69, COMP610);
		wcda.xml_INSERT(COMP66, COMP69);
		wcda.xml_INSERT(COMP67, COMP68);
		wcda.xml_INSERT(COMP66, COMP67);
		wcda.xml_INSERT(COMP65, COMP66);
		wcda.xml_INSERT(COMP61, COMP65);
		wcda.xml_INSERT(COMP61, COMP64);
		wcda.xml_INSERT(COMP61, COMP63);
		wcda.xml_INSERT(COMP61, COMP62);
		wcda.xml_INSERT(COMP60, COMP61);
		wcda.xml_INSERT(CO1,	COMP60);

		wcda.xml_INSERT(COMP57, COMP58);
		wcda.xml_INSERT(COMP54, COMP57);
		wcda.xml_INSERT(COMP55, COMP56);
		wcda.xml_INSERT(COMP54, COMP55);
		wcda.xml_INSERT(COMP53, COMP54);
		//wcda.xml_INSERT(COMP51, COMP59);
		wcda.xml_INSERT(COMP51, COMP53);
		wcda.xml_INSERT(COMP51, COMP52);
		wcda.xml_INSERT(COMP50, COMP51);
		wcda.xml_INSERT(CO1,    COMP50);
		
		wcda.xml_INSERT(COMP45, COMP46);
		wcda.xml_INSERT(COMP44, COMP45);
		wcda.xml_INSERT(COMP43, COMP44);
		//wcda.xml_INSERT(COMP41, COMP47);
		wcda.xml_INSERT(COMP41, COMP43);
		wcda.xml_INSERT(COMP41, COMP42);
		wcda.xml_INSERT(COMP40, COMP41);
		wcda.xml_INSERT(CO1,    COMP40);

		wcda.xml_INSERT(COMP327, COMP331);
		wcda.xml_INSERT(COMP327, COMP330);
		wcda.xml_INSERT(COMP327, COMP329);
		wcda.xml_INSERT(COMP327, COMP328);
		wcda.xml_INSERT(COMP326, COMP327);
		wcda.xml_INSERT(COMP316, COMP326);
		wcda.xml_INSERT(COMP324, COMP325);
		wcda.xml_INSERT(COMP323, COMP324);
		wcda.xml_INSERT(COMP316, COMP323);
		wcda.xml_INSERT(COMP321, COMP322);
		wcda.xml_INSERT(COMP316, COMP321);
		wcda.xml_INSERT(COMP316, COMP320);
		wcda.xml_INSERT(COMP316, COMP319);
		wcda.xml_INSERT(COMP316, COMP318);
		wcda.xml_INSERT(COMP316, COMP317);
		wcda.xml_INSERT(COMP315, COMP316);
		wcda.xml_INSERT(COMP38, COMP315);
		wcda.xml_INSERT(COMP313, COMP314);
		wcda.xml_INSERT(COMP38, COMP313);
		wcda.xml_INSERT(COMP38, COMP312);
		wcda.xml_INSERT(COMP38, COMP311);
		wcda.xml_INSERT(COMP38, COMP310);
		wcda.xml_INSERT(COMP38, COMP39);
		wcda.xml_INSERT(COMP37, COMP38);
		wcda.xml_INSERT(COMP31, COMP37);
		wcda.xml_INSERT(COMP35, COMP36);
		wcda.xml_INSERT(COMP34, COMP35);
		wcda.xml_INSERT(COMP33, COMP34);
		wcda.xml_INSERT(COMP31, COMP33);
		wcda.xml_INSERT(COMP31, COMP32);
		wcda.xml_INSERT(COMP30, COMP31);
		wcda.xml_INSERT(CO1, COMP30);

		wcda.xml_INSERT(COMP25, COMP26);
		wcda.xml_INSERT(COMP24, COMP25);
		wcda.xml_INSERT(COMP23, COMP24);
		//wcda.xml_INSERT(COMP21, COMP27);
		wcda.xml_INSERT(COMP21, COMP23);
		wcda.xml_INSERT(COMP21, COMP22);
		wcda.xml_INSERT(COMP20, COMP21);
		wcda.xml_INSERT(CO1,    COMP20);

		wcda.xml_INSERT(COMP15, COMP16);
		wcda.xml_INSERT(COMP14, COMP15);
		wcda.xml_INSERT(COMP13, COMP14);
		//wcda.xml_INSERT(COMP11, COMP17);
		wcda.xml_INSERT(COMP11, COMP13);
		wcda.xml_INSERT(COMP11, COMP12);
		wcda.xml_INSERT(COMP10, COMP11);
		wcda.xml_INSERT(CO1,	COMP10);

		wcda.xml_INSERT(CO18,CO27);
		wcda.xml_INSERT(CO25,CO26);
		wcda.xml_INSERT(CO18,CO25);
		wcda.xml_INSERT(CO18,CO24);
		wcda.xml_INSERT(CO22,CO23);
		wcda.xml_INSERT(CO18,CO22);
		wcda.xml_INSERT(CO18,CO21);
		wcda.xml_INSERT(CO18,CO20);
		wcda.xml_INSERT(CO18,CO19);
		wcda.xml_INSERT(CO17,CO18);
		wcda.xml_INSERT(CO10,CO17);
		wcda.xml_INSERT(CO15,CO16);
		wcda.xml_INSERT(CO10,CO15);
		wcda.xml_INSERT(CO10,CO14);
		wcda.xml_INSERT(CO10,CO13);
		wcda.xml_INSERT(CO10,CO12);
		wcda.xml_INSERT(CO10,CO11);
		wcda.xml_INSERT(CO9, CO10);
		wcda.xml_INSERT(CO4, CO9);
		wcda.xml_INSERT(CO4, CO8);
		wcda.xml_INSERT(CO4, CO7);
		wcda.xml_INSERT(CO4, CO6);
		wcda.xml_INSERT(CO4, CO5);
		wcda.xml_INSERT(CO3, CO4);
		wcda.xml_INSERT(CO1, CO3);
		wcda.xml_INSERT(CO1, CO2);
		wcda.xml_INSERT(CO0, CO1);
		//--------------
		wcda.xml_INSERT(CD,CO0);
		wcda.xml_INSERT(CD,OFF0);
		wcda.xml_INSERT(CD,R0);
		wcda.xml_INSERT(CD,L0);
		wcda.xml_INSERT(CD,CS0);
		wcda.xml_INSERT(CD,A0);
		wcda.xml_INSERT(CD,P19);

		wcda.xml_INSERT(CD,C10);
		wcda.xml_INSERT(CD,C9);
		wcda.xml_INSERT(CD,C8);
		wcda.xml_INSERT(CD,C7);
		wcda.xml_INSERT(CD,C6);
		wcda.xml_INSERT(CD,C5);
		wcda.xml_INSERT(CD,C4);
		wcda.xml_INSERT(CD,C3);
		wcda.xml_INSERT(CD,C2);
		wcda.xml_INSERT(CD,C1);

		//DELETES FILE CDA TO OVERWRITE A NEW
		wcda.xml_CLEAN(file);
		
		try (FileWriter fw = new FileWriter(file,true);){
			fw.write("<?xml version='1.0' encoding='UTF-8'?>");
			fw.close();
			//GENERATES XML FILE
			wcda.xml_PRINT(CD,file);
			System.out.println("SUCCESS IN WRITE A NEW FILE");
		}catch(Exception ex){
			System.out.println("ErroR!");
		}
	}
}
