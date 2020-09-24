package main.basics.enums;

public enum WeekDay {
    MONDAY("mon",1), TUESDAY("tue", 2), WEDNESDAY("wen", 3), THURSDAY("thu", 4), FRIDAY("fri", 5), SATURDAY("sat", 6), SUNDAY("sun", 7);
    private String name;
    private int index;

    WeekDay(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String show(WeekDay weekDay) {
        return weekDay.getName() + ">>" + weekDay.getIndex();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
