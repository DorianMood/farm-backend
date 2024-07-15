package com.rshb.game.farm.service;

import com.rshb.game.farm.model.Product;

public interface Extractable {

    Product<? extends Extractable> extractProduct();
}
