# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

Cevap:

Değişken oluştururken lateinit kullandığımızda değişkene bir başlangıç değeri atamamız gerekmez yani daha sonra tanımlanacak bir değişken oluşturmuş oluruz. Lateinit kullandığımızda dikkat etmemiz gereken şey bu değişkenin null değer almayacak olmasıdır. Eğer null değer alırsa uygulama crash olur. Yani null olmadığından emin olduğumuz değişkenleri tanımlarken lateinit kullanırız, değişkenin alacağı değeri bilmediğimiz durumlarda null kullanabiliriz böylece o değişkene null olabilme hakkı tanımış oluruz.

private lateinit var text: String
private lateinit var button: Button

text = “betül”
button = findViewById(R.id.mybutton)



### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

Cevap:


