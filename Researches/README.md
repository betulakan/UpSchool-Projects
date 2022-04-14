
# Research Projects

- [Research Project #1  - Lateinit](#1)
- [Research Project #2 - Tools Namespace](#2)


### <a name="1"></a> Research Project #1

- Why do we use lateinit?
- Can you talk about the use of lateinit?
- Can you show an example usage about lateinit?

Answer:

Değişken oluştururken lateinit kullandığımızda değişkene bir başlangıç değeri atamamız gerekmez yani daha sonra tanımlanacak bir değişken oluşturmuş oluruz. Lateinit kullandığımızda dikkat etmemiz gereken şey bu değişkenin null değer almayacak olmasıdır. Eğer null değer alırsa uygulama crash olur. Yani null olmadığından emin olduğumuz değişkenleri tanımlarken lateinit kullanırız, değişkenin alacağı değeri bilmediğimiz durumlarda null kullanabiliriz böylece o değişkene null olabilme hakkı tanımış oluruz.

```
private lateinit var text: String
private lateinit var button: Button

text = “betül”
button = findViewById(R.id.mybutton)
```


### <a name="2"></a> Research Project #2


- What is the namespace we use for our xml files in the layout directory?
- Why it is used?
- How it is used?
- Can you show the use of a Tools (tools namespace) attribute? 

Answer:

XML dosyasında tools özellikleri(attribute), uygulamamızın tasarımda nasıl göründüğü veya compile edilince nasıl görüneceği gibi davranışları uygulama build edilmeden görebilmemize olanak sağlar. Bize dizayn kısmında yardımcı olan özelliklerdir. Uygulama build edildiğinde bu özellikler kaldırılır ve APK dosyamız etkilenmez. 

Tools namespace ile gelen özellikleri kullanabilmek için her xml dosyasının root etiketine
```
xmlns:tools="http://schemas.android.com/tools"
```
eklenir.

Örneğin bir layout tasarımında arkaplanı daha görünür olması için değiştirmek istiyoruz ama bu değişikliğin uygulamada kalıcı bir değişiklik olmasını istemiyoruz.
```
android:background="@color/<some-color>"
```

Bu şekilde kullandığımızda bu değişikliği geri almayı unutabiliriz. 

```
tools:background="@color/<some-color>"
```

Tools özelliğini kullandığımızda bu yaptığımız değişiklik Android Stüdyo'da lokal olarak yapılmış olur ve uygulama APKsını etkilemez.
