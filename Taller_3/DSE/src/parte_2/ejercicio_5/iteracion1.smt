; a <= 0 || b <= 0 || c <= 0
(declare-const a Int)
(declare-const b Int)
(declare-const c Int)
(assert (not (or (<= a 0)( or (<= b 0)(<= c 0)))))
(check-sat)
(get-model)