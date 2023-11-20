package practice_and_repetition.patterns.builder;

public class Computer {
    private String motherBoard;
    private String processor;
    private String ram;
    private String graphicalCard;
    private String powerSupply;

    Computer(String motherBoard, String processor, String ram, String graphicalCard, String powerSupply) {
        this.motherBoard = motherBoard;
        this.processor = processor;
        this.ram = ram;
        this.graphicalCard = graphicalCard;
        this.powerSupply = powerSupply;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    public static class ComputerBuilder {
        private String motherBoard;
        private String processor;
        private String ram;
        private String graphicalCard;
        private String powerSupply;

        ComputerBuilder() {
        }

        public ComputerBuilder motherBoard(String motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public ComputerBuilder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder graphicalCard(String graphicalCard) {
            this.graphicalCard = graphicalCard;
            return this;
        }

        public ComputerBuilder powerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Computer build() {
            return new Computer(this.motherBoard, this.processor, this.ram, this.graphicalCard, this.powerSupply);
        }

        public String toString() {
            return "Computer.ComputerBuilder(motherBoard=" + this.motherBoard + ", processor=" + this.processor + ", ram=" + this.ram + ", graphicalCard=" + this.graphicalCard + ", powerSupply=" + this.powerSupply + ")";
        }
    }
}
