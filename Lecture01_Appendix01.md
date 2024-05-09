## Appendix 1. Casting
### What is Casting?

In Java, casting is the process of converting a value from one data type to another. There are two main types:
1. **Implicit Casting (Widening Conversion)**: Automatically converting a smaller data type to a larger one.
2. **Explicit Casting (Narrowing Conversion)**: Manually converting a larger data type to a smaller one.

### Why Does Casting Matter?

- **Implicit Casting**: This happens automatically when converting smaller to larger data types because there’s no risk of data loss.
- **Explicit Casting**: Required when converting larger to smaller data types due to potential data loss.

### Casting Examples in Different Primitive Types

#### **Byte and Short (Explicit Casting)**
- **Reason**: Both `byte` and `short` have a smaller range than `int`, so explicit casting is needed.

// ByteExampleCasting.java
package com.coherentsolutions.section02.advanced.type_byte;

public class ByteExampleCasting {
public static void main(String[] args) {
int value = 128;

        // Casting to byte explicitly because byte has a smaller range than int
        byte b = (byte) value;
        System.out.println("Casted byte value: " + b); // Output: -128 due to overflow
    }
}

// ShortExampleCasting.java
package com.coherentsolutions.section02.advanced.type_short;

public class ShortExampleCasting {
public static void main(String[] args) {
int value = 32768;

        // Casting to short explicitly because short has a smaller range than int
        short s = (short) value;
        System.out.println("Casted short value: " + s); // Output: -32768 due to overflow
    }
}

#### **Int, Long, Float, Double (Implicit Casting)**
- **Reason**: `int`, `long`, `float`, and `double` can implicitly widen to larger types without losing precision.

// IntExampleCasting.java
package com.coherentsolutions.section02.advanced.type_int;

public class IntExampleCasting {
public static void main(String[] args) {
int value = 1000;

        // Implicitly casting to long, no data loss
        long l = value;
        System.out.println("Implicitly casted long value: " + l);

        // Implicitly casting to double, no data loss
        double d = value;
        System.out.println("Implicitly casted double value: " + d);
    }
}

// LongExampleCasting.java
package com.coherentsolutions.section02.advanced.type_long;

public class LongExampleCasting {
public static void main(String[] args) {
long value = 1000L;

        // Implicitly casting to double, no data loss
        double d = value;
        System.out.println("Implicitly casted double value: " + d);

        // Casting to float explicitly
        float f = (float) value;
        System.out.println("Explicitly casted float value: " + f);
    }
}

// FloatExampleCasting.java
package com.coherentsolutions.section02.advanced.type_float;

public class FloatExampleCasting {
public static void main(String[] args) {
float value = 100.0f;

        // Implicitly casting to double, no data loss
        double d = value;
        System.out.println("Implicitly casted double value: " + d);
    }
}

#### **Why is Casting Needed?**

- **Data Loss Prevention**: Ensure that a larger data type (e.g., `int`) can fit into a smaller data type (e.g., `byte`).
- **Type Compatibility**: Make sure that the data types match the expected type.

### Summary for Beginners
1. **Implicit Casting** (Widening Conversion):
    - Automatic conversion, e.g., `int` to `long`.

2. **Explicit Casting** (Narrowing Conversion):
    - Manual conversion needed, e.g., `int` to `byte`.
    - Use parentheses and specify the target data type: `(byte) value`.

3. **Potential Data Loss**:
    - Narrowing conversion can lead to overflow, resulting in unexpected values.

### Visual Diagram to Help
byte -> short -> int -> long -> float -> double
(Widening Conversion: No Data Loss)

double -> float -> long -> int -> short -> byte
(Narrowing Conversion: Potential Data Loss)

