package ex2;

public class SeriesCalculus {
    long sum(GeneralTerm term, int n) {
        if (n == 1)
            return term.term(1);
        return sum(term, n-1) + term.term(n);
    }
}
