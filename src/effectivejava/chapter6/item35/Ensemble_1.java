package effectivejava.chapter6.item35;

// 221p
public enum Ensemble_1 {
    SOLO,DUET,TRIO,QUARTET,QUINTET,
    SEXTET,SEPTET,OCTET,DOUBLE_QUARTET,
    NONET,DECTET,TRIPLE_QUARTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
