import enums.DogBreed;
import enums.Emotion;
import enums.Gender;
import enums.Time;
import living.Dog;
import living.Fairy;
import living.Person;
import technical.Location;

public class Lab3 {
    public static void main(String[] args) {
        Fairy carlson = new Fairy("Карлсон", 30, "Полёт");
        Person junior = new Person("Малыш", 8, Gender.MALE);
        Person krister = new Person("Кристер", 8, Gender.MALE);
        Person gunilla = new Person("Гунилла", 8, Gender.FEMALE);

        Location vasaPark = new Location("Парк Ваза", 59.327707, 18.092550);
        Dog bimbo = new Dog("Бимбо", 4, DogBreed.DACHSHUND);
        bimbo.setCuteness(8);

        Dog[] someDogs = {
            new Dog("Макс", 3,  DogBreed.POODLE),
            new Dog("Люси", 2, DogBreed.LABRADOR),
            new Dog("Тузик", 5, DogBreed.BEAGLE),
            new Dog("Чарли", 4, DogBreed.GOLDEN_RETRIEVER),
            new Dog("Молли", 6, DogBreed.SHEPHERD)
        };
        for (int i = 0; i < 5; i++) {
            someDogs[i].setCuteness((int) (Math.random() * 10));
        }

        junior.walk(vasaPark, Time.MORNING);
        bimbo.walk(vasaPark, Time.MORNING);
        junior.setEmotion(Emotion.NEUTRAL);
        bimbo.setEmotion(Emotion.NEUTRAL);
        junior.say("Я всё же думаю, что это гном. Пошли, Бимбо!");
        bimbo.think("Вау, это самый весёлый час за весь день, сейчас здесь обнюхаю всех симпатичных собак и поболтаю с ними");
        for (int i = 0; i < 5; i++) {
            bimbo.sniff(someDogs[i]);
            if (someDogs[i].getCuteness() >= 5) {
                Dog cuteDog = someDogs[i];
                cuteDog.barkAt(bimbo);
                bimbo.barkAt(cuteDog);
                bimbo.setEmotion(Emotion.HAPPY);
            }
        }
        junior.think("А где Кристер и Гунилла?");
        junior.think("Может быть, они уже уехали на каникулы");
        junior.setEmotion(Emotion.CARELESS);
        junior.think("Ха, плевать, у меня ж есть Карлсон. Ну и Бимбо");
    }
}