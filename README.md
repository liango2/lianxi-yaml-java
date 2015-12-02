今天在Java中用到了yaml格式，所以在这里做个记录，方便以后查阅

1：导入包(用的是maven)

    <groupId>org.jyaml</groupId>
     <artifactId>jyaml</artifactId>
     <version>1.3</version>

2：写yaml文件（要注意缩进，和测试代码放在同包下，在实际工程中可以放任意位置）
    abc:
      ip: 1
      username: abc
      pwd: 123456
      port: 10001
3:读取yaml文件

    Yaml yaml=new Yaml();
        InputStream resourceAsStream = Main.class.getClassLoader().getResourceAsStream("yaml文件名.yml");
    System.out.println(((Map)a.get("abc")).get("username"));

OK!到这里大工告成