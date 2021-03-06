package com.cleverlance.academy.iotServer.controller.mapper;

import com.cleverlance.academy.iotServer.model.WeatherValues;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.openapitools.model.MeteoData;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-19T19:56:54+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Amazon.com Inc.)"
)
@Component
public class WeatherValuesMapperImpl implements WeatherValuesMapper {

    @Override
    public MeteoData toMeteoData(WeatherValues weatherValues) {
        if ( weatherValues == null ) {
            return null;
        }

        MeteoData meteoData = new MeteoData();

        meteoData.setHumidity( BigDecimal.valueOf( weatherValues.getHumidity() ) );
        meteoData.setTemperature( BigDecimal.valueOf( weatherValues.getTemperature() ) );
        meteoData.setLight( BigDecimal.valueOf( weatherValues.getLight() ) );
        meteoData.setPressure( BigDecimal.valueOf( weatherValues.getPressure() ) );

        return meteoData;
    }

    @Override
    public WeatherValues toWeatherValues(MeteoData meteoData) {
        if ( meteoData == null ) {
            return null;
        }

        WeatherValues weatherValues = new WeatherValues();

        if ( meteoData.getTemperature() != null ) {
            weatherValues.setTemperature( meteoData.getTemperature().longValue() );
        }
        if ( meteoData.getHumidity() != null ) {
            weatherValues.setHumidity( meteoData.getHumidity().longValue() );
        }
        if ( meteoData.getPressure() != null ) {
            weatherValues.setPressure( meteoData.getPressure().longValue() );
        }
        if ( meteoData.getLight() != null ) {
            weatherValues.setLight( meteoData.getLight().longValue() );
        }

        return weatherValues;
    }

    @Override
    public List<MeteoData> toMeteoData(List<WeatherValues> weatherValues) {
        if ( weatherValues == null ) {
            return null;
        }

        List<MeteoData> list = new ArrayList<MeteoData>( weatherValues.size() );
        for ( WeatherValues weatherValues1 : weatherValues ) {
            list.add( toMeteoData( weatherValues1 ) );
        }

        return list;
    }
}
