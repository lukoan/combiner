/*
 *    Copyright 2021, 2022 Lukasz Kowalczyk
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package lk.cs.combiner;

import java.util.List;

/**
 * An interface ICombiner<T> with a combine method
 * @param <T>
 */
public interface ICombiner<T> {

    /**
     * Transforms the input according to the implementation
     * @param input
     * @return
     */
    List<List<T>> combine(List<List<T>> input);

    /**
     * Transforms the input according to the implementation and returns only a subset<br>
     * of results, i.e. every k result from the combined output list
     *
     * @param input
     * @param k
     * @return
     */
    List<List<T>> combine(List<List<T>> input, int k);
}
