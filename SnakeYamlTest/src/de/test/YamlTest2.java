package de.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import org.yaml.snakeyaml.Yaml;

public class YamlTest2 {
	
	static Mitarbeiter[] mitarbeiter = new Mitarbeiter[3];
	static Yaml yaml = new Yaml();
	
	static void init(){
		mitarbeiter[0] = new Mitarbeiter();
		mitarbeiter[0].setName("Mustermann");
		mitarbeiter[0].setVorname("Max");
		mitarbeiter[0].setPosition("IT Consultant");
		mitarbeiter[1] = new Mitarbeiter();
		mitarbeiter[1].setName("Morano");
		mitarbeiter[1].setVorname("Fabian");
		mitarbeiter[1].setPosition("IT Consultant");
		mitarbeiter[2] = new Mitarbeiter();
		mitarbeiter[2].setName("Dampf");
		mitarbeiter[2].setVorname("Martin");
		mitarbeiter[2].setPosition("IT Consultant");
		
	}
	
	public static void main(String[] args) {
		init();
		String output = new Yaml().dump(mitarbeiter);
		System.out.println(output);
		//System.out.println(mitarbeiter[2].getName());
		
		 try {
			 InputStream input = new FileInputStream(new File("mitarbeiter3.yml"));
			 Yaml yaml = new Yaml();
			 //Object data = yaml.load(input);
			 ArrayList<Mitarbeiter> aMitarbeiter = new ArrayList<Mitarbeiter>();
			 aMitarbeiter = (ArrayList<Mitarbeiter>) yaml.load(input);
			 //System.out.println(aMitarbeiter.get(1).getName());			 

			 Object[] objArray = aMitarbeiter.toArray();
			 //Mitarbeiter[] ma = (Mitarbeiter[]) objArray;

			 Mitarbeiter arMa[] = aMitarbeiter.toArray(new Mitarbeiter[aMitarbeiter.size()]);
			 System.out.println(arMa[1]);
			 
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
