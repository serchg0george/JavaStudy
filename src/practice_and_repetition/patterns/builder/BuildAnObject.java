package practice_and_repetition.patterns.builder;

public class BuildAnObject {
    public static void main(String[] args) {
        Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder();
        Computer.ComputerBuilder computerBuilder1 = new Computer.ComputerBuilder();

        computerBuilder.motherBoard("MSI")
                .graphicalCard("NVIDIA")
                .powerSupply("ASUS")
                .ram("CORSAIR")
                .processor("INTEL")
                .build();

        computerBuilder1
                .motherBoard("ASUS")
                .processor("AMD")
                .ram("SAMSUNG")
                .powerSupply("CHIEFTECH")
                .graphicalCard("RADEON")
                .build();

        System.out.println(computerBuilder + " another computer: \n" + computerBuilder1);
    }
}
