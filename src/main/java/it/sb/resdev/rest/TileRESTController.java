package it.sb.resdev.rest;

import it.sb.resdev.persistence.SeaLevelService;
import it.sb.resdev.rest.repository.Tile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import javax.validation.constraints.NotEmpty;

@RestController
@RequestScope
public class TileRESTController {

    Logger logger = LogManager.getLogger(TileRESTController.class);

    @Autowired
    SeaLevelService sls;

    @GetMapping(path = "/{sealevel}/tile/{x}/{y}/{z}", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody()
    byte[] tile(@PathVariable("sealevel") @NotEmpty String sealevel, //
                @PathVariable("x") @NotEmpty String xParam, //
                @PathVariable("y") @NotEmpty String yParam, //
                @PathVariable("z") @NotEmpty String zParam) {

        if (!zParam.endsWith(".jpg")) {
//			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return null;
        }

        zParam = zParam.replace(".jpg", "");

        int x;
        int y;
        int z;
        try {
            x = Integer.parseInt(xParam);
            y = Integer.parseInt(yParam);
            z = Integer.parseInt(zParam);
        } catch (NumberFormatException e) {
//			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return null;
        }

        byte[] tileData = null;
        Tile tile = sls.getTile(sealevel, x, y, z);
        if (tile != null) {
            tileData = tile.getTile_data();
        }
        return tileData;
    }
}