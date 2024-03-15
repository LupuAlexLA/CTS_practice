package _00_SOLID.interfaces;

import _00_SOLID.exceptions.InvalidListException;

import java.util.List;

public interface Computable {
    double computeResult(List<Integer> list) throws InvalidListException;
}
