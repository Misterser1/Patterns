package org.rustem.behavioralPatterns.iterator;

public class Developer implements Collection {
    private String language;
    private String name;
    private String[] skills;

    public Developer(String language, String name, String[] skills) {
        this.language = language;
        this.name = name;
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public class SkillIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            if (index < skills.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
