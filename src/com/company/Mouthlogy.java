package com.company;

public class Mouthlogy {
    public static void main(String[] args) {
Personn professor= Personn.build().
        setProfession("professor")
        .setBiology(true)
        .setEcology(true)
        .setGeography(true)
        .getPersonn();
        System.out.println(professor.toString());
    }

}

class Personn {
    private String profession = "";
    private boolean biology = false;
    private boolean ecology = false;
    private boolean zoology = false;
    private boolean geography = false;
    private boolean physiology = false;
    private boolean swiminology = false;
    private boolean escapology = false;
    private boolean sharkology = false;
    private boolean crocodilogy = false;
    private boolean assology = false;
    private boolean headology = false;
    private boolean mouthology = false;

    @Override
    public String toString() {
        return "Personn{" +
                "profession='" + profession + '\'' +
                ", biology=" + biology +
                ", ecology=" + ecology +
                ", zoology=" + zoology +
                ", geography=" + geography +
                ", physiology=" + physiology +
                ", swiminology=" + swiminology +
                ", escapology=" + escapology +
                ", sharkology=" + sharkology +
                ", crocodilogy=" + crocodilogy +
                ", assology=" + assology +
                ", headology=" + headology +
                ", mouthology=" + mouthology +
                '}';
    }

    public String getProfession() {
        return profession;
    }

    public boolean isBiology() {
        return biology;
    }

    public boolean isEcology() {
        return ecology;
    }

    public boolean isZoology() {
        return zoology;
    }

    public boolean isGeography() {
        return geography;
    }

    public boolean isPhysiology() {
        return physiology;
    }

    public boolean isSwiminology() {
        return swiminology;
    }

    public boolean isEscapology() {
        return escapology;
    }

    public boolean isSharkology() {
        return sharkology;
    }

    public boolean isCrocodilogy() {
        return crocodilogy;
    }

    public boolean isAssology() {
        return assology;
    }

    public boolean isHeadology() {
        return headology;
    }

    public boolean isMouthology() {
        return mouthology;
    }

    public static Builder build(){
        return new Personn().new Builder();
    }
    public class Builder {
        public Builder setProfession(String profession) {
            Personn.this.profession = profession;
            return this;
        }

        public Builder setBiology(boolean biology) {
            Personn.this.biology = biology;
            return this;
        }

        public Builder setEcology(boolean ecology) {
            Personn.this.ecology = ecology;
            return this;
        }

        public Builder setZoology(boolean zoology) {
            Personn.this.zoology = zoology;
            return this;
        }

        public Builder setGeography(boolean geography) {
            Personn.this.geography = geography;
            return this;
        }

        public Builder setPhysiology(boolean physiology) {
            Personn.this.physiology = physiology;
            return this;
        }

        public Builder setSwiminology(boolean swiminology) {
            Personn.this.swiminology = swiminology;
            return this;
        }

        public Builder setEscapology(boolean escapology) {
            Personn.this.escapology = escapology;
            return this;
        }

        public Builder setSharkology(boolean sharkology) {
            Personn.this.sharkology = sharkology;
            return this;
        }

        public Builder setCrocodilogy(boolean crocodilogy) {
            Personn.this.crocodilogy = crocodilogy;
            return this;
        }

        public Builder setAssology(boolean assology) {
            Personn.this.assology = assology;
            return this;
        }

        public Builder setHeadology(boolean headology) {
            Personn.this.headology = headology;
            return this;
        }

        public Builder setMouthology(boolean mouthology) {
            Personn.this.mouthology = mouthology;
            return this;
        }

        public Personn getPersonn() {
            return Personn.this;
        }

    }
}
class Sailor{

    private String profession = "";
    private boolean biology = false;
    private boolean ecology = false;
    private boolean zoology = false;
    private boolean geography = false;
    private boolean physiology = false;
    private boolean swiminology = false;
    private boolean escapology = false;
    private boolean sharkology = false;
    private boolean crocodilogy = false;
    private boolean assology = false;
    private boolean headology = false;
    private boolean mouthology = false;

    @Override
    public String toString() {
        return "Sailor{" +
                "profession='" + profession + '\'' +
                ", biology=" + biology +
                ", ecology=" + ecology +
                ", zoology=" + zoology +
                ", geography=" + geography +
                ", physiology=" + physiology +
                ", swiminology=" + swiminology +
                ", escapology=" + escapology +
                ", sharkology=" + sharkology +
                ", crocodilogy=" + crocodilogy +
                ", assology=" + assology +
                ", headology=" + headology +
                ", mouthology=" + mouthology +
                '}';
    }

    public String getProfession() {
        return profession;
    }

    public boolean isBiology() {
        return biology;
    }

    public boolean isEcology() {
        return ecology;
    }

    public boolean isZoology() {
        return zoology;
    }

    public boolean isGeography() {
        return geography;
    }

    public boolean isPhysiology() {
        return physiology;
    }

    public boolean isSwiminology() {
        return swiminology;
    }

    public boolean isEscapology() {
        return escapology;
    }

    public boolean isSharkology() {
        return sharkology;
    }

    public boolean isCrocodilogy() {
        return crocodilogy;
    }

    public boolean isAssology() {
        return assology;
    }

    public boolean isHeadology() {
        return headology;
    }

    public boolean isMouthology() {
        return mouthology;
    }

    public static Sailor.Builder build(){
        return new Sailor().new Builder();
    }
    public class Builder {
        public Sailor.Builder setProfession(String profession) {
            Sailor.this.profession = profession;
            return this;
        }

        public Sailor.Builder setBiology(boolean biology) {
            Sailor.this.biology = biology;
            return this;
        }

        public Sailor.Builder setEcology(boolean ecology) {
            Sailor.this.ecology = ecology;
            return this;
        }

        public Sailor.Builder setZoology(boolean zoology) {
            Sailor.this.zoology = zoology;
            return this;
        }

        public Sailor.Builder setGeography(boolean geography) {
            Sailor.this.geography = geography;
            return this;
        }

        public Sailor.Builder setPhysiology(boolean physiology) {
            Sailor.this.physiology = physiology;
            return this;
        }

        public Sailor.Builder setSwiminology(boolean swiminology) {
            Sailor.this.swiminology = swiminology;
            return this;
        }

        public Sailor.Builder setEscapology(boolean escapology) {
            Sailor.this.escapology = escapology;
            return this;
        }

        public Sailor.Builder setSharkology(boolean sharkology) {
            Sailor.this.sharkology = sharkology;
            return this;
        }

        public Sailor.Builder setCrocodilogy(boolean crocodilogy) {
            Sailor.this.crocodilogy = crocodilogy;
            return this;
        }

        public Sailor.Builder setAssology(boolean assology) {
            Sailor.this.assology = assology;
            return this;
        }

        public Sailor.Builder setHeadology(boolean headology) {
            Sailor.this.headology = headology;
            return this;
        }

        public Sailor.Builder setMouthology(boolean mouthology) {
            Sailor.this.mouthology = mouthology;
            return this;
        }

        public Sailor getSailor() {
            return Sailor.this;
        }

    }

}