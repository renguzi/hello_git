package com.journaldev.access1;

public class TestA {

    private void methodPrivate() {
    }

    public void methodPublic() {
        methodPrivate();
    }

    protected void methodProtected() {
        methodPrivate();
    }

    void methodDefault() {
        methodPrivate();
    }
}
