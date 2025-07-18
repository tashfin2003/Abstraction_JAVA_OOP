abstract public class Hospital{
    void patient1(){
        System.out.println("No Head");
    }
    void patient2(){
        System.out.println("Head pain");
    }
    abstract void patient3();
}

class Tashfin extends Hospital{
    @Override
    void patient3(){
        System.out.println("Tashfin has No Leg");
    }
}

class Tawhid extends Hospital{
    @Override
    void patient3(){
        System.out.println("Tawhid has no hand");
    }
}

class Raju extends Hospital{
    @Override
    void patient3(){
        System.out.println("Raju is a fermer");
    }
}