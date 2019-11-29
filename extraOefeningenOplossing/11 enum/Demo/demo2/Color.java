package demo2;

public enum  Color {

    BLACK(0x00_00_00) {
        @Override
        public String toString() {
            return "Black";
        }
    },
    WHITE(0xFF_FF_FF) {
        @Override
        public String toString() {
            return "White";
        }
    },
    RED(0xFF_00_00) {
        @Override
        public String toString() {
            return "Red";
        }
    },
    GREEN(0x00_FF_00) {
        @Override
        public String toString() {
            return "Green";
        }
    },
    BLUE(0x00_00_FF) {
        @Override
        public String toString() {
            return "Blue";
        }
    },
    YELLOW(0xFF_FF_00) {
        @Override
        public String toString() {
            return "Yellow";
        }
    };

    private int rgb;

    private Color(int rgb) {
        this.rgb = rgb;
    }

    private int getRgb() {
        return rgb;
    }

    private void setRgb(int rgb) {
        this.rgb = rgb;
    }
}

