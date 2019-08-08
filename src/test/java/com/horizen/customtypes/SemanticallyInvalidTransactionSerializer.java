package com.horizen.customtypes;

import com.horizen.transaction.TransactionSerializer;
import scala.util.Try;
import scorex.util.serialization.Reader;
import scorex.util.serialization.Writer;

public class SemanticallyInvalidTransactionSerializer implements TransactionSerializer<SemanticallyInvalidTransaction> {

    private static SemanticallyInvalidTransactionSerializer serializer;

    static {
        serializer = new SemanticallyInvalidTransactionSerializer();
    }

    private SemanticallyInvalidTransactionSerializer() {
        super();
    }

    public static SemanticallyInvalidTransactionSerializer getSerializer() {
        return serializer;
    }


    @Override
    public byte[] toBytes(SemanticallyInvalidTransaction obj) {
        return obj.bytes();
    }

    @Override
    public Try<SemanticallyInvalidTransaction> parseBytesTry(byte[] bytes) {
        return SemanticallyInvalidTransaction.parseBytes(bytes);
    }

    @Override
    public void serialize(SemanticallyInvalidTransaction obj, Writer writer) {
        writer.putBytes(obj.bytes());
    }

    @Override
    public SemanticallyInvalidTransaction parse(Reader reader) {
        return SemanticallyInvalidTransaction.parseBytes(reader.getBytes(reader.remaining())).get();
    }
}