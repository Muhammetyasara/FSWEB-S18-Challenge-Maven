package com.workintech.fswebs18challengemaven.util;

import com.workintech.fswebs18challengemaven.entity.Color;
import com.workintech.fswebs18challengemaven.entity.Type;
import com.workintech.fswebs18challengemaven.exceptions.CardException;
import org.springframework.http.HttpStatus;

public class CardValidation {

    public static void validateCard(Integer value, Type type, Color color) {

        if (type == Type.JOKER){
            if (value != null || color != null){
                throw new CardException("Kart joker ise value ve color değerleri olmamalı.", HttpStatus.BAD_REQUEST);
            }
            return;
        }

        if (value != null && type != null){
            throw new CardException("Hem value hem type olamaz.", HttpStatus.BAD_REQUEST);
        }

        if (value == null && type == null){
            throw new CardException("Hem value hem type null olamaz.", HttpStatus.BAD_REQUEST);
        }

        if (color == null){
            throw new CardException("Color null olamaz.", HttpStatus.BAD_REQUEST);
        }
    }
}
