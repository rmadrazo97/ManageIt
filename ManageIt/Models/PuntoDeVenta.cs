//------------------------------------------------------------------------------
// <auto-generated>
//     Este código se generó a partir de una plantilla.
//
//     Los cambios manuales en este archivo pueden causar un comportamiento inesperado de la aplicación.
//     Los cambios manuales en este archivo se sobrescribirán si se regenera el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ManageIt.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class PuntoDeVenta
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public PuntoDeVenta()
        {
            this.Bodega = new HashSet<Bodega>();
        }
    
        public int idPuntoDeVenta { get; set; }
        public string direccion { get; set; }
        public int capacidad { get; set; }
        public int idEmpleado { get; set; }
    
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Bodega> Bodega { get; set; }
        public virtual Empleado Empleado { get; set; }
    }
}
