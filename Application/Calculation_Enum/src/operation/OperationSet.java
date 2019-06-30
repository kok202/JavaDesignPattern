package operation;

import java.util.HashMap;
import java.util.Map;

public enum OperationSet implements Operation {
    ADD("+") {
        @Override
        public int calc(int num1, int num2) {
            return num1 + num2;
        }
    },
    SUB("-") {
        @Override
        public int calc(int num1, int num2) {
            return num1 - num2;
        }
    },
    MUL("*") {
        @Override
        public int calc(int num1, int num2) {
            return num1 * num2;
        }
    },
    DIV("/") {
        @Override
        public int calc(int num1, int num2) {
            return num1 / num2;
        }
    };

    private final String name;
    private static Map<String, Operation> requestLookup;
    static {
        requestLookup = new HashMap<String, Operation>(3);
        requestLookup.put(ADD.name, ADD);
        requestLookup.put(SUB.name, SUB);
        requestLookup.put(MUL.name, MUL);
        requestLookup.put(DIV.name, DIV);
    }

    private OperationSet(String name) {
        this.name = name;
    }

    public static Operation getOperationByName(String name) {
        return requestLookup.get(name);
    }
}