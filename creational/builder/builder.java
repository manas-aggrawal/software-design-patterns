class Pizza {
    private int size;
    private String crust;
    private boolean cheese = false;
    private boolean onion = false;
    private boolean tomato = false;
    private boolean mushroom = false;
    private boolean pineapple = false;
    
    private Pizza(Builder builder) {
        this.size = builder.size;    
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.onion = builder.onion;
        this.tomato = builder.tomato;
        this.mushroom = builder.mushroom;
        this.pineapple = builder.pineapple;
    }
    
    public void getPizza() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" inch ").append(crust).append(" crust pizza");
        if(cheese || onion || tomato || mushroom || pineapple) {
            sb.append(" with: ");
            if(cheese) sb.append("cheese ");
            if(onion) sb.append("onion ");
            if(tomato) sb.append("tomato ");
            if(mushroom) sb.append("mushroom ");
            if(pineapple) sb.append("pineapple ");
        }
        System.out.println(sb);
    }
    
    
    public static class Builder {
        private int size;
        private String crust;
        private boolean cheese = false;
        private boolean onion = false;
        private boolean tomato = false;
        private boolean mushroom = false;
        private boolean pineapple = false;
        
        public Builder(int size, String crust) {
            this.size = size;
            this.crust = crust;
        }
        
        public Builder addCheese() {
            this.cheese = true;
            return this;
        }
        
        public Builder addOnion() {
            this.onion = true;
            return this;
        }
        
        public Builder addTomato() {
            this.tomato = true;
            return this;
        }
        
        public Builder addMushroom() {
            this.mushroom = true;
            return this;
        }
        
        public Builder addPineapple() {
            this.pineapple = true;
            return this;
        }
        
        public Pizza build() {
            return new Pizza(this);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.Builder(14, "stuffed")
                                           .addCheese()
                                           .addOnion()
                                           .addPineapple()
                                           .build();
        pizza1.getPizza();
        
        Pizza pizza2 = new Pizza.Builder(8, "thin")
                                           .addTomato()
                                           .addMushroom()
                                           .build();
        pizza2.getPizza();
    }
}