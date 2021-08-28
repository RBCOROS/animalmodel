package sample.animal.constants;


import java.util.Arrays;

public enum RoosterLangConstants {
    DANISH("Danish", "kykyliky"),
    DUTCH("Dutch" , "kukeleku"),
    ENGLISH("English", "kukuruku"),
    FILIPINO("Filipino", "Kokorokok"),
    FRENCH("French", "Cocorico"),
    GERMAN("German", "Kikiriki"),
    NA("NA", "NA");

    private final String language;
    private final String sound;

    RoosterLangConstants(String language, String sound) {
        this.language = language;
        this.sound = sound;
    }

    public String getLanguage() {
        return language;
    }

    public String getSound() {
        return sound;
    }


   public static String getRooseterSoundPerLang (String lang) {
        Arrays.stream(RoosterLangConstants.values()).filter(c -> c.getLanguage().equalsIgnoreCase(lang))
                .map(RoosterLangConstants::getSound).findFirst().orElse(NA.getSound());
        return null;
   }

}
