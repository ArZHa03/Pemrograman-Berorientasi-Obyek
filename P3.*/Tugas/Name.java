class Name {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getFrontName() {
        String frontName = this.name.substring(0, this.name.indexOf(" ") + 1);

        return frontName;
    }

    public String getBackName() {
        String backName = this.name.substring(this.name.indexOf(" ") + 1, this.name.length());

        return backName;
    }
}
