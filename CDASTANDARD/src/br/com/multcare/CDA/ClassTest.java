package br.com.multcare.CDA;

public class ClassTest {
	public static void main(String args[]) {
		CDA cda = new CDA();
		
		cda.CDA_HEADER("UV","1.3","POCD_HD000040","10.20.1","M345","3.933","Diagnostico utilizando MultCare",
				   "410.9","6.103","ICD-9-CM","20171003","N","Normal","5.25","Confidentiality","MM1","1");

		cda.CDA_PATIENT("12345","Endereço do paciente","+55(082)9996-5599","Primeiro nome paciente","sobrenome",
					"M","5.1","20170924","nullFlavor","nullFlavor","nullFlavor","nullFlavor","...","...","M555");

		cda.CDA_AUTHOR("CRM456546", "Endereço do médico", "+55(082)9996-5599", "Primeiro nome do médico", "Sobrenome");

		cda.CDA_AUTHENTICATOR("S");

		cda.CDA_RELATED("RPLC", "a123", "BB35", "1");

		cda.CDA_COMPONENTOF("1.3.6.1.4.1.16517", "20130307_100^INTERNAL MEDICINE", "20130307", "UNK",
						"MA","CHESTNUT HILL","02467", "850 BOYLSTON ST SUITE 530", "(617)732-9900",
						"WP", "Doe", "John", "M.", "M.D.", "BPG AT 850 BOYLSTON - INTERNAL MEDICINE ");

		cda.CDA_PROBLEM("DOCSECT","EVN", "10.20.22.2.5.1", "11450-4","6.1","LOINC","Problema atual",
					"Histórico da doença atual","Ditar como está o histórico do paciente em relação a doença que ele possui.",
					"DRIV","10.20.22.4.3","NI","CONC","5.6","active","20140212130114","SUBJ","10.20.22.4.4","5.4","text/plain",
					"#Problem-1","completed","CD");

		cda.CDA_HISTORY_DOCTOR("Histórico médico passado", "Nome da doença");

		cda.CDA_MEDICINES("Medicamentos", "Nome do medicamento : dosagem");

		cda.CDA_ALLERGY("Alergias", "Alergia - reação","10.20.22.4.30", "C33 = 1" , "48765-2","active","NASK","10.20.22.4.7",
					"419199007","6.96","#Allergy-1","true","10.20.22.4.28","33999-4","CE","55561003","SNOMED");

		cda.CDA_HISTORY_FAMILY("Histórico familiar", "problemas");

		cda.CDA_EXAMS("Exame/Métrica físico", "Altura: 1,77m","Peso: 77kg");

		cda.CDA_EXAMS_LAB("10.20.22.2.3.1","30954-2","Exames de laboratório","Hormônio A : quantidade","Hormônio B : quantidade",
				"CLUSTER","10.20.22.4.1","100025030719-A97875DA-940F-11E3-90AC-1CC4B7D83400","2951-2","glicose [Massa/volume] no Plasma",
				"10.20.22.4.2","SODIUM","text/plain","201402111354","48766-0","Nome do lab","TXT","text/plain","136-145 mmol/L");

		cda.CDA_DIAGNOSTIC("Diagnóstico", "Diabetes tipo 1", "Rim com problema tal.");

		cda.CDA_TRATAMENT("Tratamento", "Tomar remédio três vezes por dia.","Fazer exercícios cinco vezes por semana.");

		cda.CREATE_STANDARD("CDA.xml");
	}
}
