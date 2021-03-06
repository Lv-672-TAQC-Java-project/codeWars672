package com.org.ita;

import org.apache.commons.lang3.SerializationUtils;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataProviderUserImplementation {
    public static Object[][] combine(Object[][] impl, Object[][] _data) {
        List<Object[]> listObjects = new ArrayList<>();
        for (Object[] obj_impl : impl) {
            Object[][] data = SerializationUtils.clone(_data);
            for (Object[] obj_data : data) {
                int totalLength = obj_data.length + obj_impl.length;
                Object[] objArr = new Object[totalLength];

                Object[] objDataClone = Arrays.stream(obj_data).toArray();
                System.arraycopy(obj_impl, 0, objArr, 0, obj_impl.length);
                System.arraycopy(objDataClone, 0, objArr, obj_impl.length, totalLength - 1);

                listObjects.add(objArr);
            }
        }

        return listObjects.toArray(new Object[0][0]);

    }

    @DataProvider
    public Object[][] implementationsFiveKataDataProvider() {
        return new Object[][]{
                {new com.org.ita.kata.implementation.IrynaRybak.FiveImpl()},
                {new com.org.ita.kata.implementation.DianaStoyko.FiveImpl()},
                {new com.org.ita.kata.implementation.KaterynaMushynska.FiveImpl()},
                {new com.org.ita.kata.implementation.MikeRomanyshyn.FiveImpl()},
                {new com.org.ita.kata.implementation.OlehPysko.FiveImpl()},
                {new com.org.ita.kata.implementation.OliaDmytryk.FiveIml()},
                {new com.org.ita.kata.implementation.PopenkoI.FiveImpl()},
                {new com.org.ita.kata.implementation.RomanVytrykush.FiveImpl()},
                {new com.org.ita.kata.implementation.YevgenAleksandrovich.Fiveimpl()},
                {new com.org.ita.kata.implementation.YuriiDruzhytskyi.FiveImpl()}
        };
    }


    @DataProvider
    public Object[][] implementationsSixKataDataProvider() {
        return new Object[][]{
                {new com.org.ita.kata.implementation.IrynaRybak.SixImpl()},
                {new com.org.ita.kata.implementation.DianaStoyko.SixImpl()},
                {new com.org.ita.kata.implementation.KaterynaMushynska.SixImpl()},
                {new com.org.ita.kata.implementation.MikeRomanyshyn.SixImpl()},
                {new com.org.ita.kata.implementation.OlehPysko.SixImpl()},
                {new com.org.ita.kata.implementation.OliaDmytryk.SixImpl()},
                {new com.org.ita.kata.implementation.PopenkoI.SixImpl()},
                {new com.org.ita.kata.implementation.RomanVytrykush.SixImpl()},
                {new com.org.ita.kata.implementation.YevgenAleksandrovich.Siximpl()},
                {new com.org.ita.kata.implementation.YuriiDruzhytskyi.SixImpl()},
        };
    }

    @DataProvider
    public Object[][] implementationsSevenKataDataProvider() {
        return new Object[][]{
                {new com.org.ita.kata.implementation.IrynaRybak.SevenImpl()},
                {new com.org.ita.kata.implementation.DianaStoyko.SevenImpl()},
                {new com.org.ita.kata.implementation.KaterynaMushynska.SevenImpl()},
                {new com.org.ita.kata.implementation.MikeRomanyshyn.SevenImpl()},
                {new com.org.ita.kata.implementation.OlehPysko.SevenImpl()},
                {new com.org.ita.kata.implementation.OliaDmytryk.SevenIml()},
                {new com.org.ita.kata.implementation.PopenkoI.SevenImpl()},
                {new com.org.ita.kata.implementation.RomanVytrykush.SevenImpl()},
                {new com.org.ita.kata.implementation.YevgenAleksandrovich.Sevenimpl()},
                {new com.org.ita.kata.implementation.YuriiDruzhytskyi.SevenImpl()},
        };
    }

    @DataProvider
    public Object[][] implementationsEightKataDataProvider() {
        return new Object[][]{
                {new com.org.ita.kata.implementation.IrynaRybak.EigthImpl()},
                {new com.org.ita.kata.implementation.DianaStoyko.EigthImpl()},
                {new com.org.ita.kata.implementation.KaterynaMushynska.EightImpl()},
                {new com.org.ita.kata.implementation.MikeRomanyshyn.EightImpl()},
                {new com.org.ita.kata.implementation.OlehPysko.EightImpl()},
                {new com.org.ita.kata.implementation.OliaDmytryk.EightImpl()},
                {new com.org.ita.kata.implementation.PopenkoI.EightImpl()},
                {new com.org.ita.kata.implementation.RomanVytrykush.EightImpl()},
                {new com.org.ita.kata.implementation.YevgenAleksandrovich.Eightimpl()},
                {new com.org.ita.kata.implementation.YuriiDruzhytskyi.EightImpl()}
        };
    }

}

