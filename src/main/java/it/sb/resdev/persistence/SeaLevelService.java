package it.sb.resdev.persistence;

import it.sb.resdev.rest.repository.Tile;
import it.sb.resdev.rest.repository.TileId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.validation.constraints.Null;

@Service
public class SeaLevelService {

    @Autowired
    private EntityManagerLocator eml;

    @Null
    @Cacheable(value = "80", key = "{#x, #y, #z}")
    public Tile get80Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("80");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "90", key = "{#x, #y, #z}")
    public Tile get90Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("90");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "100", key = "{#x, #y, #z}")
    public Tile get100Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("100");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "110", key = "{#x, #y, #z}")
    public Tile get110Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("110");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "120", key = "{#x, #y, #z}")
    public Tile get120Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("120");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "130", key = "{#x, #y, #z}")
    public Tile get130Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("130");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "140", key = "{#x, #y, #z}")
    public Tile get140Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("140");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "150", key = "{#x, #y, #z}")
    public Tile get150Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("150");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "160", key = "{#x, #y, #z}")
    public Tile get160Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("160");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "170", key = "{#x, #y, #z}")
    public Tile get170Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("170");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "180", key = "{#x, #y, #z}")
    public Tile get180Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("180");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "190", key = "{#x, #y, #z}")
    public Tile get190Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("190");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "200", key = "{#x, #y, #z}")
    public Tile get200Tile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("200");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    @Null
    @Cacheable(value = "full", key = "{#x, #y, #z}")
    public Tile getFullTile(int x, int y, int z) {
        EntityManager em = eml.getEntityManager("full");
        Tile tile = em.find(Tile.class, TileId.of(x, y, z));
        em.close();
        return tile;
    }

    public Tile getTile(String seaLevel, int x, int y, int z) {
        switch (seaLevel) {
            case "80":
                return get80Tile(x, y, z);
            case "90":
                return get90Tile(x, y, z);
            case "100":
                return get100Tile(x, y, z);
            case "110":
                return get110Tile(x, y, z);
            case "120":
                return get120Tile(x, y, z);
            case "130":
                return get130Tile(x, y, z);
            case "140":
                return get140Tile(x, y, z);
            case "150":
                return get150Tile(x, y, z);
            case "160":
                return get160Tile(x, y, z);
            case "170":
                return get170Tile(x, y, z);
            case "180":
                return get180Tile(x, y, z);
            case "190":
                return get190Tile(x, y, z);
            case "200":
                return get200Tile(x, y, z);
            case "full":
                return getFullTile(x, y, z);

            default:
                return null;
        }
    }
}
