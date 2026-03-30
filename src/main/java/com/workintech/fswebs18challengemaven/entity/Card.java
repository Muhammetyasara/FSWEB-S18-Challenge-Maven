package com.workintech.fswebs18challengemaven.entity;

import com.workintech.fswebs18challengemaven.util.CardValidation;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "card")
@NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "value")
    private Integer value;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    private Color color;

    public Card(Integer value, Type type, Color color) {
        this.value = value;
        this.type = type;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
