public enum SubjectStudent {
    MATH("Математика"),
    Literature("Литература"),
    Geography ("География"),
    Informatics("Информатика");
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    SubjectStudent(String name) {
        this.name = name;
    }

}
