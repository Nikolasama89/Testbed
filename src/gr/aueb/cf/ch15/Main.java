package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {


        ISpeakable cat = new Cat("Marga");
        ISpeakable dog = new Dog("Nikos");

        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(cat);
        GenericSpeakingSchool genericSpeakingSchool2 = new GenericSpeakingSchool(dog);

//        cat.speak();
//        dog.speak();
//
//        doSpeak(cat);
//        doSpeak(dog);

        genericSpeakingSchool1.learnToSpeak();
        genericSpeakingSchool2.learnToSpeak();
    }

    public static void doSpeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
