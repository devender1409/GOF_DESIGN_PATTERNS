package com.callmedev.designpatterns.creational._5builder;

import java.math.BigDecimal;

public class Burger {
    private String bun;
    private boolean cheese;
    private boolean sauce;
    private boolean cabbage;
    private BigDecimal price;
    private String name;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Burger{");
        sb.append("bun='").append(bun).append('\'');
        sb.append(", cheese=").append(cheese);
        sb.append(", sauce=").append(sauce);
        sb.append(", cabbage=").append(cabbage);
        sb.append(", price=").append(price);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Burger(Builder builder) {
        this.bun = builder.bun;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.cabbage = builder.cabbage;
        this.price = builder.price;
        this.name = builder.name;
    }

    public static class Builder{
        private String bun;
        private boolean cheese;
        private boolean sauce;
        private boolean cabbage;
        private BigDecimal price;
        private String name;

        public Builder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public Builder setCheese(boolean cheese) {
            this.cheese = cheese;
            return this;

        }

        public Builder setSauce(boolean sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setCabbage(boolean cabbage) {
            this.cabbage = cabbage;
            return this;
        }

        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
