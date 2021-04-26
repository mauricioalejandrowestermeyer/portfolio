package org.custom.builder;

public class MainBuilderApplication {

    public static void main(String[] args) {

        InputBuilder builder = new InputBuilder();
        //generamos un intbox
        IntboxBuilder intboxBuilder = new IntboxBuilder();
        builder.setInput(intboxBuilder);
        builder.createIntbox();
        Intbox intbox = intboxBuilder.getIntbox();
        //generamos un datebox
        DateboxBuilder dateboxBuilder = new DateboxBuilder();
        builder.setInput(dateboxBuilder);
        builder.createDatebox();
        Datebox datebox = dateboxBuilder.getDatebox();
        //generamos un textbox
        TextboxBuilder textboxBuilder = new TextboxBuilder();
        builder.setInput(textboxBuilder);
        builder.createTextbox();
        Textbox textbox = textboxBuilder.getTextbox();

        //mostramos algunos atributos

        System.out.println(intbox.getLabel());
        System.out.println(datebox.getLabel());
        System.out.println(textbox.getLabel());
    }
}
