# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

Cevap:

Değişken oluştururken lateinit kullandığımızda değişkene bir başlangıç değeri atamamız gerekmez yani daha sonra tanımlanacak bir değişken oluşturmuş oluruz. Lateinit kullandığımızda dikkat etmemiz gereken şey bu değişkenin null değer almayacak olmasıdır. Eğer null değer alırsa uygulama crash olur. Yani null olmadığından emin olduğumuz değişkenleri tanımlarken lateinit kullanırız, değişkenin alacağı değeri bilmediğimiz durumlarda null kullanabiliriz böylece o değişkene null olabilme hakkı tanımış oluruz.

```
private lateinit var text: String
private lateinit var button: Button

text = “betül”
button = findViewById(R.id.mybutton)
```


### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

Cevap:

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
