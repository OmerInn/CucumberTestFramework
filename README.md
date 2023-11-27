# CucumberTestFramework

🚀 Selenium Cucumber Test Automation Project

Bu proje, Selenium ve Cucumber teknolojilerini kullanarak otomasyon testleri yazmak için oluşturulmuş bir örnektir. Aşağıda projenin ana bileşenlerini ve özelliklerini bulabilirsiniz:

1. Proje Yapısı
Page Object Model (POM): Sayfa nesnelerini temsil eden sınıflar ve bu sınıfların soyutlanmış bir yapı içinde organize edilmesi.
AbstractPage: Selenium WebDriver ve WebDriverWait kullanarak temel işlemleri gerçekleştiren soyut bir sayfa sınıfı.
2. Page Sınıfları
a. ContactUsPage
Contact Formu Testleri: "Contact us" formunu doldurarak başarılı gönderimi kontrol eden test senaryoları.
DropDown Seçimi: Selenium Select sınıfını kullanarak dropdown'dan değer seçme örneği.
Assert İşlemleri: Beklenen ve gerçek değerlerin karşılaştırılması için Assert kullanımı.
b. RegisterPage
Üyelik Oluşturma Senaryoları: "Register" sayfasındaki formu doldurarak üyelik oluşturma test senaryoları.
Background Senaryo: Ortak adımları birleştirerek tekrar eden senaryoları daha anlaşılır ve temiz tutma.
3. TestNG ile Senaryo Yürütme
Cucumber ve TestNG: CucumberOptions kullanılarak senaryo seçimi ve TestNG entegrasyonu.
SmokeTest ve RegressionTest: Belirli etiketlere sahip senaryoları yürütmek için ayrı test sınıfları.
4. Test Raporlama
Extent Reports: Cucumber senaryolarından elde edilen raporların oluşturulması ve yönetilmesi için kullanılan Extent Reports örneği.
5. WebDriver Yönetimi
WebDriverManager: WebDriver sürücülerini otomatik olarak yönetmek için WebDriverManager kütüphanesi kullanımı.

ContactUs.feature: Bu özellik, web sitesine gidip iletişim sayfasını test etmeyi amaçlar. Senaryo, belirli adımları takip ederek iletişim sayfasına gitmeyi, gerekli bilgileri doldurmayı ve bir mesajı göndermeyi içerir. Başarılı bir gönderim sonrasında gelen başarı mesajını doğrulamak da senaryo kapsamındadır.

Register.feature: Bu özellik, dinamik bir şekilde kullanıcı hesaplarını oluşturmayı test eder. Senaryo, farklı kullanıcı özelliklerini (email, soyadı, şifre vb.) içeren veri setleriyle çalışarak her bir kullanıcıyı teker teker test eder. Bu sayede kaydedilmiş kullanıcı bilgilerini kullanarak hesap oluşturmanın doğru çalışıp çalışmadığı kontrol edilir.

Register_Background.feature: Bu özellik, daha önce yazılmış test senaryolarının başka bir özellik dosyasında tekrar kullanılmasını göstermek amacıyla oluşturulmuştur. Senaryo arka planında (Background) belirli adımları kullanarak bir kullanıcıyı kaydetmeyi gerçekleştirir. Ardından, bu kaydedilmiş kullanıcı bilgilerini kullanarak farklı senaryoları içeren örneklerin çalıştırılmasını sağlar. Bu, yazılmış olan senaryoların farklı feature dosyaları arasında tekrar kullanılabilirliğini vurgular.



https://github.com/OmerInn/CucumberTestFramework/assets/86193525/6ef3004f-4a00-4ea8-9a8f-2157ccaf4565

