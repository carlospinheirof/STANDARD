package br.com.multcare.CDA;

import java.io.File;
import java.io.FileWriter;

public class Wxml {
		public Wxml(){
		}
		public class TAG{
		private String info;
		private String content;
		private TAG first;
		private TAG next;

			public void setInfo(String INFO) {
				this.info = INFO;
			}
			public String getInfo() {
				return info;
			}
			public void setContent(String CONTENT) {
				this.content= CONTENT;
			}
			public String getContent() {
				return content;
			}
			public TAG getFirst() {
				return first;
			}
			public void setFirst(TAG first) {
				this.first= first;
			}
			public TAG getNext() {
				return next;
			}
			public void setNext(TAG next) {
				this.next= next;
			}
		}
		public TAG xml_CREATE(String TAG_NAME,String TAG_CONTENT) {
			TAG n = new TAG();
			n.setInfo(TAG_NAME);
			n.setContent(TAG_CONTENT);
			n.setFirst(null);
			n.setNext(null);
			return n;
		}
		public void xml_CLEAN(String FILENAME) {
			try {
				boolean del = (new File(FILENAME)).delete();
				if(del)System.out.println("FILE DELETED!");
			}catch(Exception ex) {
				System.out.println("ErroR!");
			}
		}
		public void xml_INSERT(TAG TAG,TAG SUB_TAG) {
			SUB_TAG.setNext(TAG.getFirst());
			TAG.setFirst(SUB_TAG);
		}
		public void xml_PRINT(TAG TAG,String fileName) {
			try (FileWriter fw = new FileWriter(fileName,true);){
				if(TAG.getFirst() == null && TAG.getContent().equals("")) {
					//WRITE JUST ONE LINE <CONTENT/>
					fw.write(String.format("\n<%s/>",TAG.getInfo()));
				}else {
					fw.write(String.format("\n<%s>",TAG.getInfo()));
				}
				//WRITE CONTENT
				fw.write(String.format("%s",TAG.getContent()));
				fw.close();
			}catch(Exception ex) {System.out.println("ErroR!");}

			for(TAG p = TAG.getFirst();p != null; p = p.getNext())
				xml_PRINT(p,fileName);
			
			int pos = TAG.getInfo().indexOf(' ');//CHECKS SPACE IN <TAG>
			
			try (FileWriter fw = new FileWriter(fileName,true);){
				if(TAG.getFirst() != null) {
					if(pos!=-1) // SPACE IN THE </TAG_>
						fw.write(String.format("\n</%s>",TAG.getInfo().substring(0,pos)));
					else //NO SPACE IN THE </TAG>
						fw.write(String.format("\n</%s>",TAG.getInfo()));
				}else if(TAG.getFirst() == null && !TAG.getContent().equals(""))
					if(pos!=-1) // SPACE IN THE </TAG_>
						fw.write(String.format("</%s>",TAG.getInfo().substring(0,pos)));
					else //NO SPACE IN THE </TAG>
						fw.write(String.format("</%s>",TAG.getInfo()));
				fw.close();
			}catch(Exception ex) {
				System.out.println("ErroR");
			}
		}
}