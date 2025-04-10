; not(c1) and not (c2) and not(c3)
;c1=(a<=0 or b<=0 or c<=0)
;c2=(not (a + b > c and a + c > b and b + c > a))
;c3=(a == b and b == c)
;c4=(a == b or b == c or a == c)
(declare-const a Int)
(declare-const b Int)
(declare-const c Int)
(assert (not (or (<= a 0)(or (<= b 0)(<= c 0)))))
(assert (> (+ a b) c))
(assert (> (+ a c) b))
(assert (> (+ b c) a))
(assert (not (and (= a b)(= b c))))
(assert (not (or (= a b)(or (= b c)(= a c)))))
(check-sat)
(get-model)