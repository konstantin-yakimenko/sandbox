package com.example.sandbox.entity;

import java.io.Serializable;

public class TestId implements Serializable {
    private Integer key1Id;
    private Integer key2Id;

    public TestId(Integer key1Id, Integer key2Id) {
        this.key1Id = key1Id;
        this.key2Id = key2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestId)) return false;

        TestId testId = (TestId) o;

        if (key1Id != null ? !key1Id.equals(testId.key1Id) : testId.key1Id != null) return false;
        return key2Id != null ? key2Id.equals(testId.key2Id) : testId.key2Id == null;
    }

    @Override
    public int hashCode() {
        int result = key1Id != null ? key1Id.hashCode() : 0;
        result = 31 * result + (key2Id != null ? key2Id.hashCode() : 0);
        return result;
    }
}
