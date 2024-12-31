package it.sb.resdev.rest.repository;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
public class TileId implements Serializable {

	private static final long serialVersionUID = -7249586179680874025L;

	private int tile_row;
	private int tile_column;
	private int zoom_level;

	public TileId(int tile_row, int tile_column, int zoom_level) {
		this.tile_row = tile_row;
		this.tile_column = tile_column;
		this.zoom_level = zoom_level;
	}

	public static TileId of(int tile_row, int tile_column, int zoom_level) {
		return new TileId(tile_row, tile_column, zoom_level);
	}
}
