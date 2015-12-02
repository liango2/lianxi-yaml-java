package org.liango;

import org.ho.yaml.Yaml;

import java.io.InputStream;
import java.util.Map;

/**
 * @author liango
 * @version 1.0
 * @since 2015-12-03 2:14
 */
public class Main {
    public static void main(String[] args) {
        Yaml yaml=new Yaml();
        InputStream resourceAsStream = Main.class.getClassLoader().getResourceAsStream("yaml文件名.yml");
        System.out.println("resourceAsStream = " + resourceAsStream);
        Map a=(Map)yaml.load(resourceAsStream);
        System.out.println(((Map)a.get("abc")).get("username"));
    }
}
