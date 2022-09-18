class Text {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void replaceText(String oldText, String newText) {
        this.text = this.text.replaceAll(oldText, newText);
    }

    public String getText() {
        return this.text;
    }
}
