package vn.com.jackycore.net;

import io.reactivex.Flowable;

/**
 * Created by sgvn213 on 9/22/2017.
 */

public interface ObjectParamRequestUseCase<T> {
    Flowable<T> request(Object... data);
}
