/**
 1 singleton icin ilk sart disardan nesnesi olusmasin. Bu yuzden constructoru private yapiyoruz. (birden fazla const olmasin ve default const private olsun)
 2 disardan erisilemeyen icerde private profile instance olusturduk.
 3 instance i  geri donduren public fonksiyon yazdik.
 4 bu fonksiyona disardan erisirsek nesneye erismis olacagiz. (getter gibi.)
 5 fonksiyonu static yaparsak disardan erisebiliriz. Profile.newInstance() seklinde erisiriz.
 */

public class Profile {

    private volatile static Profile profile;
    /*
    synchronized in degisken icin olan ismi volatile dir. Ayni anda degiskene tek bir thread erismesini saglar.
    bu degisken private olsa bile reflection ile erisimide engglemek  icin volatile keywordu yazilir.
    eger bir degisken static degilse static func icinde kullanilamaz o yuzden burayada static koyuyoruz
    public olarak tutarsak mainde Profile.profile = Profile.newInstance(); yaparim anlami kalmaz singletonin.
     */
    private Profile() {
    /*
    bizim bir class in nesnesini olusturabilmemiz o class in constructorunin durumuna (private public) baglidir.
    hicbir constructor yazilmadiysa default olarak bos constructor yazilir. ama publictir. instance uretir.
    fakat class in constructoruni private yaparsak scope disinda instance olusturamayiz.
    */
    }

    public synchronized static Profile newInstance() {
        // synchronized keywordu ayni anda birden fazla threadin instance olusturmasini onler siraya koyar ve singleton in bozulmasini engeller.
        if (profile == null){
            // deger atamasi yapmazsa defaultta null
            profile = new Profile();
            //null ise instance olustur, cunku ilkkez erisiyoruz demektir. degilse profile dondur.
        }
        return profile;  //icerde olusturdugumuz instance i public bir fonksiyonla geri donduruyoruz.
    }

}


