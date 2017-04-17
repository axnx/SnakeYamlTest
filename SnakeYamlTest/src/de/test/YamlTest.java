package de.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.reader.StreamReader;

public class YamlTest {

	public static void main(String[] args) throws FileNotFoundException {

		Mitarbeiter mitarbeiter;
		Yaml yaml = new Yaml();
		Object obj = null;


		System.out.println(yaml.dump(yaml.load(new FileInputStream(new File(
				"mitarbeiter.yml")))));

		try {
			InputStream in = new FileInputStream(new File("mitarbeiter.yml"));	
			//MitarbeiterList ma = yaml.loadAs(in, MitarbeiterList.class);

			Map<String,Object> result = (Map<String,Object>)yaml.load(in);
			System.out.println(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		//	System.out.println(ma);
	}
}
