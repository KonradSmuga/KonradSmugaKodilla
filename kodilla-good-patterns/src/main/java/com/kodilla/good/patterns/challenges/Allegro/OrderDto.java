package com.kodilla.good.patterns.challenges.Allegro;



public class OrderDto {

        public User user;
        public Item item;
        public boolean isOrdered;

    public OrderDto(User user, Item item, boolean isOrdered) {
        this.user = user;
        this.item = item;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
